package com.hand.springbootMybatis;

import com.hand.springbootMybatis.entity.Course;
import com.hand.springbootMybatis.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {
    @Autowired
    private CourseMapper courseXmlMapper;
    //    查询
    @Test
    public void test4 (){
        List<Course> courses = courseXmlMapper.listAll();
        System.out.println(courses);
    }

    @Test
    void contextLoads() {
    }
//增加
    @Test
    public void test1() {
        Course course = new Course();
        course.setCourseNo("c123");
        course.setCourseName("springboot");
        course.setTeacherNo("t001");

        int insert = courseXmlMapper.insert(course);

        if (insert==1){
            System.err.println("数据添加成功");
        }
        else
            System.err.println("数据添加失败");

    }
//    修改
    @Test
    public void test3() {
        Course course = new Course();
        course.setCourseNo("c123");
        course.setCourseName("java高级攻城狮");
        course.setTeacherNo("t003");
        int i = courseXmlMapper.updateIgnoreNull(course);
        if (i==1){
            System.err.println("修改成功");
        }else
            System.err.println("修改失败");
    }


    //    删除
    @Test
    public void test2() {
        int c009 = courseXmlMapper.delete("c123");
        if (c009==1){
            System.err.println("删除成功");
        }else
            System.err.println("删除失败");
    }
}
