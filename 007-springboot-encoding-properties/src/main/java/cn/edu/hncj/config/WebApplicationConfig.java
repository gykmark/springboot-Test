package cn.edu.hncj.config;

import cn.edu.hncj.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServlet;

@Configuration
public class WebApplicationConfig extends HttpServlet {

    //注册Servlet
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new MyServlet());
        servletRegistrationBean.addUrlMappings("/myServlet");
        return servletRegistrationBean;
    }
}
