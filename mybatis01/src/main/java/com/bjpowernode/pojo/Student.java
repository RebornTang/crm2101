package com.bjpowernode.pojo;

import java.util.Date;

public class Student {
    private Integer id;
    private String username;
    private String sex;
    private Integer age;
    private Date birthday;
    private String grade;
    private String major;

    public Student() {
    }

    public Student(String username , String sex , Integer age , Date birthday , String grade , String major) {
        this.username = username;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.grade = grade;
        this.major = major;
    }

    public Student(Integer id , String username , String sex , Integer age , Date birthday , String grade , String major) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder ( "Student{" );
        sb.append ( "id=" ).append ( id );
        sb.append ( ", username='" ).append ( username ).append ( '\'' );
        sb.append ( ", sex='" ).append ( sex ).append ( '\'' );
        sb.append ( ", age=" ).append ( age );
        sb.append ( ", birthday=" ).append ( birthday );
        sb.append ( ", grade='" ).append ( grade ).append ( '\'' );
        sb.append ( ", major='" ).append ( major ).append ( '\'' );
        sb.append ( '}' );
        return sb.toString ();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
