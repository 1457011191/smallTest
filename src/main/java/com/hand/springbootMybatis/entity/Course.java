package com.hand.springbootMybatis.entity;

import lombok.Data;

@Data
public class Course {
    /** 课程名称 */
    private String courseName;
    /** 课程号 */
    private String courseNo;
    /** 教师编号 */
    private String teacherNo;

}
