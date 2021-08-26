package dobby.upscale.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfiguration implements WebMvcConfigurer {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

//		registry.addResourceHandler("/**").addResourceLocations("/resources/front/");

        registry.addResourceHandler("/css/**").addResourceLocations("resources/css");
        registry.addResourceHandler("/js/**").addResourceLocations("resources/js");
        registry.addResourceHandler("/resources/**").addResourceLocations("resources/");
        // front html + publish files
//		registry.addResourceHandler("/**").addResourceLocations("WEB-INF/jsp/");
//		registry.addResourceHandler("/vue-shop/**").addResourceLocations("resources/vue-shop/");
//		registry.addResourceHandler("/public/**").addResourceLocations("resources/public/");
//		registry.addResourceHandler("/assets/**").addResourceLocations("resources/public/assets/");

//		super.addResourceHandlers(registry);
    }

}
