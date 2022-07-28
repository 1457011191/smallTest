package com.hand.springbootMybatis.entity;

import lombok.Data;

@Data
public class TeacherEmp {
    /** 员工编码 */
    private String empNo;
    /** 管理者编码 */
    private String managerNo;
    /** 教师编码 */
    private String teacherNo;
}
