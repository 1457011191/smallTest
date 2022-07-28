package com.hand.springbootMybatis.Controller;

import com.hand.springbootMybatis.entity.Course;
import com.hand.springbootMybatis.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ThymeleafController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        List<Course> courses = courseService.listAll();
        System.out.println(courses);
        model.addAttribute("courseList",courses);

        return "demo/demoHtm";
    }
}
