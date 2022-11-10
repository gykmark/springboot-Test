package cn.edu.hncj.service.impl;

import cn.edu.hncj.dao.StudentDao;
import cn.edu.hncj.model.Student;
import cn.edu.hncj.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao = null;

    @Override
    public Student queryStudent(Integer id) {
        Student student = studentDao.selectStudent(id);
        return student;
    }
}
