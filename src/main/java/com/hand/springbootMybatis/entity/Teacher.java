package com.hand.springbootMybatis.entity;

import lombok.Data;

@Data
public class Teacher {
    /** 上级编号 */
    private String managerNo;
    /** 教师名称 */
    private String teacherName;
    /** 教师编号 */
    private String teacherNo;
}
