package com.bjpowernode.domain;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.pojo.Student;
import com.bjpowernode.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentApp {
    @Test
    public void testSelectStudent(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession ();
        StudentDao dao = sqlSession.getMapper ( StudentDao.class );
        List<Student> students = dao.selectStudent ();
        for (Student student:students){
            System.out.println (student);
        }
    }

    @Test
    public void testInsertStudent(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession ();
        StudentDao mapper = sqlSession.getMapper ( StudentDao.class );
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("yyyy-MM-dd");
        Date parse = null;
        try {
            parse = simpleDateFormat.parse ( "1999-12-22" );
        } catch (ParseException e) {
            e.printStackTrace ();
        }
        Student student = new Student ( "xiaoshi" , "man" , 22 , parse , "JAVA1401" , "JAVA软件工程" );
        int i = mapper.insertStudent ( student );
        sqlSession.commit ();
        sqlSession.close ();
    }

    @Test
    public void testDeleteStudent(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession ();
        StudentDao dao = sqlSession.getMapper ( StudentDao.class );
        List list = new ArrayList();
        list.add ( 5 );
        list.add ( 6 );
        int i = dao.deleteStudent ( list );
        sqlSession.commit ();
        sqlSession.close ();
    }

    @Test
    public void testUpdateStudent(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession ();
        StudentDao mapper = sqlSession.getMapper ( StudentDao.class );
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ( "yyyy-MM-dd" );
        Date parse = null;
        try {
            parse = simpleDateFormat.parse ( "1995-12-11" );
        } catch (ParseException e) {
            e.printStackTrace ();
        }
        Student student = new Student ( 7 , "xiaotian" , "woman" , 25 , parse , "WEB1403" , "WEB程序设计专业" );
        int i = mapper.updateStudent (student);
        sqlSession.commit ();
        sqlSession.close ();
    }

}
