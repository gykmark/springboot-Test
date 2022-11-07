package cn.edu.hncj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //配置端口号
    @Value("${server.port}")
    private Integer port;

    //配置路径
    @Value("${server.servlet.context-path}")
    private String contextPath;

    //配置学校名
    @Value("${school.name}")
    private String name;

    //配置网站
    @Value("${school.website}")
    private String website;

    //配置地址
    @Value("${school.address}")
    private String address;

    //配置其他网站
    @Value("${site}")
    private String site;

    @RequestMapping("/data")
    @ResponseBody
    public String queryData(){
        return port+" "+contextPath+" "+name+" "+website+" "+address+" "+site;
    }
}
