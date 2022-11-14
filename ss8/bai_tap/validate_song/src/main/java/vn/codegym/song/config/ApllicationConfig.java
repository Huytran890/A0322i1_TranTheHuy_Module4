package vn.codegym.song.config;

@Configuration
public class ApplicationConfig {
    @Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("validates");
        messageSource.setDefaultEncoding("UTF-8");

        return messageSource;
    }
}
