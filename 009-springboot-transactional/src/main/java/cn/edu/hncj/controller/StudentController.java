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
    private StudentService studentService =null;

    @RequestMapping("/add")
    @ResponseBody
    public int addStudent(){
        Student student = new Student();
        student.setName("赵六");
        student.setAge(22);
        int i = studentService.addStudent(student);
        return i;
    }
}
