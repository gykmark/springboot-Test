package cn.edu.hncj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    //learn the use of annotations

    //inquire id=1 about students

    /**
     * @PathVariable(路径变量):get the data in the url
     *             attribute：value:define variables
     *             location: place in front of the parameters of the controller method
     *
     *            ${stuId}:define PathVariable
     */
    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable("stuId")Integer studentId){
        return "查询学生studentId  "+studentId;
    }

    @PutMapping("/student/{name}/{age}")
    public String updateStudent(@PathVariable("name")String name,
                                @PathVariable("age") Integer age){
        return "修改学生信息 "+name+" "+age;
    }

}
