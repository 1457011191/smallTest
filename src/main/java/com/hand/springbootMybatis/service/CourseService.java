package com.hand.springbootMybatis.service;

import com.hand.springbootMybatis.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {
    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<Course> listAll();


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public Course getById(String courseNo);

    /**
     * 新增，插入所有字段
     *
     * @param course 新增的记录
     * @return 返回影响行数
     */
    public int insert(Course course);

    /**
     * 新增，忽略null字段
     *
     * @param course 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(Course course);

    /**
     * 修改，修改所有字段
     *
     * @param course 修改的记录
     * @return 返回影响行数
     */
    public int update(Course course);

    /**
     * 修改，忽略null字段
     *
     * @param course 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(Course course);
    /**
     * 删除记录
     *
     * @param courseNo 待删除的记录
     * @return 返回影响行数
     */
    public int delete(String courseNo);
}
