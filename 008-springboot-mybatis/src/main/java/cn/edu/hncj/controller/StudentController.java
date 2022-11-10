package cn.edu.hncj.controller;

import cn.edu.hncj.model.Student;
import cn.edu.hncj.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService = null;

    @RequestMapping("/student/query")
    @ResponseBody
    public String queryStudent(Integer id){
        Student student = studentService.queryStudent(id);
        System.out.println(student.toString());
        return student.toString();
    }
}
