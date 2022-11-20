package vn.codegym.song.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDto implements Validator {
    private Integer idSong;

    @NotEmpty(message = "{empty.invalid}")
    @NotBlank(message = "{blank.invalid}")
    @Size(max = 800, message = "{size.invalid}")
    @Pattern(regexp = "^([\\w]*[\\s]*[\\w]*)+$", message = "{char.invalid}")
    private String nameSong;
    @NotEmpty(message = "{empty.invalid}")
    @NotBlank(message = "{blank.invalid}")
    @Size(max = 300, message = "{size2.invalid}")
    @Pattern(regexp = "^([\\w]*[\\s]*[\\w]*)+$", message = "{char.invalid}")
    private String singer;
    @NotEmpty(message = "{empty.invalid}")
    @NotBlank(message = "{blank.invalid}")
    @Size(max = 1000, message = "{size3.invalid}")
    @Pattern(regexp = "^([\\w]*[\\s]*[\\w]*[,]*)+$", message = "{char2.invalid}")
    private String category;

    public SongDto() {
    }

    public SongDto(Integer idSong, String nameSong, String singer, String category) {
        this.idSong = idSong;
        this.nameSong = nameSong;
        this.singer = singer;
        this.category = category;
    }

    public Integer getIdSong() {
        return idSong;
    }

    public void setIdSong(Integer idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
