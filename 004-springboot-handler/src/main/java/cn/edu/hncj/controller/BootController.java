package cn.edu.hncj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {

    //访问user开头的地址
    @RequestMapping("/account")
    @ResponseBody
    public String userAccount(){
        return "访问/user/account地址";
    }

    //访问login开头的地址
    @RequestMapping("/index")
    @ResponseBody
    public String loginIndex(){
        return "访问/login/index地址";
    }
}
