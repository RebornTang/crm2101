package com.bjpowernode.dao;

import com.bjpowernode.pojo.Student;

import java.util.List;

public interface StudentDao {
    /**
     * 查询学生表中数据
     * @return
     */
    public List<Student> selectStudent();

    /**
     *
     * @param student
     * @return
     */
    public int insertStudent(Student student);

    /**
     *
     * @param student
     * @return
     */
    public int updateStudent(Student student);

    /**
     *
     * @param list
     * @return
     */
    public int deleteStudent(List list);

}
