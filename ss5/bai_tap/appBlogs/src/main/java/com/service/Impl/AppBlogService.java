package com.service.Impl;

@Service
public class AppBlogService implements IAppBlogService {
    @Autowired
    private IAppBlogRepository appBlogRepository;

    @Override
    public List<AppBlog> findAll() {
        return this.appBlogRepository.findAll();
    }

    @Override
    public void save(AppBlog appBlog) {

        this.appBlogRepository.save(appBlog);
    }

    @Override
    public void deleteById(int id) {
        this.appBlogRepository.deleteById(id);
    }

    @Override
    public AppBlog findById(int id) {
        return this.appBlogRepository.findById(id).orElse(null);
    }

    @Override
    public List<AppBlog> listSearch(String name) {
        return this.appBlogRepository.listSearch("%"+name+"%");
    }


}
