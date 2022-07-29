package com.hand.springbootMybatis.service.impl;

import com.hand.springbootMybatis.entity.Course;
import com.hand.springbootMybatis.mapper.CourseMapper;
import com.hand.springbootMybatis.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> listAll() {
        return courseMapper.listAll();
    }

    @Override
    public Course getById(String courseNo) {
        return courseMapper.getById(courseNo);
    }

    @Override
    public int insert(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public int insertIgnoreNull(Course course) {
        return courseMapper.insertIgnoreNull(course);
    }

    @Override
    public int update(Course course) {
        return courseMapper.update(course);
    }

    @Override
    public int updateIgnoreNull(Course course) {
        return courseMapper.updateIgnoreNull(course);
    }

    @Override
    public int delete(String courseNo) {
        return courseMapper.delete(courseNo);
    }
}
