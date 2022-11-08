package cn.edu.hncj.config;

import cn.edu.hncj.web.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    //添加拦截器对象，注入到容器中
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //创建拦截器对象
        LoginInterceptor loginInterceptor = new LoginInterceptor();

        //指定拦截的uri地址
        String path []= {"/account/**"};
        //指定不拦截的uri地址
        String excludePath [] = {"/index/**"};
        registry.addInterceptor(loginInterceptor).
                addPathPatterns(path).
                excludePathPatterns(excludePath);

    }
}
