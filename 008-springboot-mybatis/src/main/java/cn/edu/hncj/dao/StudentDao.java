package cn.edu.hncj.dao;

import cn.edu.hncj.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *  @Mapper: Tell mybatis that this is a Dao object,
 *              create a proxy object for this interface
 *          position: above the class
 */
public interface StudentDao {

    Student selectStudent(@Param("stuId") Integer id);
}
