package cn.edu.hncj.service.impl;

import cn.edu.hncj.dao.StudentMapper;
import cn.edu.hncj.model.Student;
import cn.edu.hncj.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper =null;

    /**
     * @Transactional: the representation method has transaction support
     *        default: use the isolation level of the library
     *                      REQUIRED
     *                 a run-time exception is thrown,roll back the transaction
     */
    @Transactional
    @Override
    public int addStudent(Student record){
        System.out.println("业务方法addStudent");
        int insert = studentMapper.insert(record);
        System.out.println("执行sql语句");

        //a Runtime exception is thrown,the purpose is to roll back the transaction
        int n = 1 / 0;
        return insert;
    }
}
