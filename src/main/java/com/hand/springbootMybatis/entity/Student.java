package com.hand.springbootMybatis.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Student {
    /** 年龄 */
    private BigDecimal studentAge;
    /** 性别 */
    private String studentGender;
    /** 姓名 */
    private String studentName;
    /** 学号 */
    private String studentNo;
}
