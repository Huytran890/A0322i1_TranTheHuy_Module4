package com.service.Impl;

@Service
public class BlogTypeService implements IBlogTypeService {
    @Autowired
    private IBlogTypeRepository blogTypeRepository;

    @Override
    public List<BlogType> findAll() {
        return this.blogTypeRepository.findAll();
    }
}
