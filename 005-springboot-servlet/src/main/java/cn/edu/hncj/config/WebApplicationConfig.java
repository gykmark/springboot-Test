package cn.edu.hncj.config;

import cn.edu.hncj.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebApplicationConfig {

    //定义方法，注册Servlet对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean =
                new ServletRegistrationBean(new MyServlet(),"/myservlet");
        return bean;
    }
}
