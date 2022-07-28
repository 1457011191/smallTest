package com.hand.springbootMybatis.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class StudentCore {

    /** 分数 */
    private BigDecimal core;
    /** 课程号 */
    private String courseNo;
    /** 学号 */
    private String studentNo;
}
