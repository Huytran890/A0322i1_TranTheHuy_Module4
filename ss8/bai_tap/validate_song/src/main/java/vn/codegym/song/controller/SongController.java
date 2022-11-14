package vn.codegym.song.controller;

@Controller
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping("/list")
    public String songList(Model model,
                           @PageableDefault(value = 3) Pageable pageable) {
        model.addAttribute("song", this.songService.findAll(pageable));

        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("songDto", new SongDto());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated SongDto songDto,
                         BindingResult bindingResult) {
        new SongDto().validate(songDto,bindingResult);

        if (bindingResult.hasFieldErrors()) {
            return "create";
        } else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto, song);
            songService.save(song);
        }

        return "redirect:/list";
    }

    @GetMapping("/edit")
    public String goUpdate(@RequestParam("id") int id,
                           Model model) {
        SongDto songDto = new SongDto();
        BeanUtils.copyProperties(this.songService.findById(id),songDto);

        model.addAttribute("songDto", songDto);
        return "update";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute @Validated SongDto songDto,
                         BindingResult bindingResult) {

        new SongDto().validate(songDto,bindingResult);

        if (bindingResult.hasFieldErrors()) {
            return "update";
        } else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto, song);
            songService.save(song);
        }

        return "redirect:/list";
    }
}
