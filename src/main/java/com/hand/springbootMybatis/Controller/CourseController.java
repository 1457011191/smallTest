package com.hand.springbootMybatis.Controller;


import com.hand.springbootMybatis.entity.Course;
import com.hand.springbootMybatis.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

//查询
    @PostMapping("/list")
    public List<Course> listAll() {
        return courseService.listAll();
    }
//删除
    @GetMapping("/delete/{courseNo}")
    public String delete(@PathVariable String courseNo){
        String mse;
        int delete = courseService.delete(courseNo);
        if (delete==1){
             mse ="删除成功";
        }else{
             mse ="删除失败,数据库中不存在这个id";}
        return mse;
    }

//    也可以这么传参   /course/delete?courseNo=c900    瞎打&&&&&
//    @GetMapping("/delete")
//    public String delete(String courseNo){
//        String mse;
//        int delete = courseService.delete(courseNo);
//        if (delete==1){
//            mse ="删除成功";
//        }else
//            mse ="删除失败,数据库中不存在这个id";
//        return mse;
//    }


    @PostMapping("/add")
    public String add(Course course){

        int insert = courseService.insert(course);
            String mse;
        if (insert==1){
            mse ="添加成功";
        }else{
            mse ="添加失败";}
        return mse;
    }
}
