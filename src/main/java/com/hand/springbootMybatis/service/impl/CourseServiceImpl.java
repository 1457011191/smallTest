package com.hand.springbootMybatis.service.impl;

import com.hand.springbootMybatis.entity.Course;
import com.hand.springbootMybatis.mapper.CourseXmlMapper;
import com.hand.springbootMybatis.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseXmlMapper courseXmlMapper;

    @Override
    public List<Course> listAll() {
        return courseXmlMapper.listAll();
    }

    @Override
    public Course getById(String courseNo) {
        return courseXmlMapper.getById(courseNo);
    }

    @Override
    public int insert(Course course) {
        return courseXmlMapper.insert(course);
    }

    @Override
    public int insertIgnoreNull(Course course) {
        return courseXmlMapper.insertIgnoreNull(course);
    }

    @Override
    public int update(Course course) {
        return courseXmlMapper.update(course);
    }

    @Override
    public int updateIgnoreNull(Course course) {
        return courseXmlMapper.updateIgnoreNull(course);
    }

    @Override
    public int delete(String courseNo) {
        return courseXmlMapper.delete(courseNo);
    }
}
