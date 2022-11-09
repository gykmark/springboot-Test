package cn.edu.hncj.config;

import cn.edu.hncj.web.MyFilter;
import cn.edu.hncj.web.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class WebApplicationConfig {

    //定义方法，注册Servlet对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean =
                new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return bean;
    }

    //注册字符集过滤器
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();

        //指定编码方式
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        //指定编码方式为utf-8
        encodingFilter.setEncoding("utf-8");
        //让request和response都改变编码方式
        encodingFilter.setForceEncoding(true);
        //过滤的地址
        bean.addUrlPatterns("/*");
        bean.setFilter(encodingFilter);
        return bean;
    }

    //注册路径过滤器
    @Bean
    public FilterRegistrationBean filterRegistrationBean01(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new MyFilter());
        bean.addUrlPatterns("/user/*");
        return bean;
    }
}
