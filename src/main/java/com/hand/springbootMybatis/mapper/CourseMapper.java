package com.hand.springbootMybatis.mapper;

import com.hand.springbootMybatis.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    List<Course> listAll();


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    Course getById(String courseNo);

    /**
     * 新增，插入所有字段
     *
     * @param course 新增的记录
     * @return 返回影响行数
     */
    int insert(Course course);

    /**
     * 新增，忽略null字段
     *
     * @param course 新增的记录
     * @return 返回影响行数
     */
    int insertIgnoreNull(Course course);

    /**
     * 修改，修改所有字段
     *
     * @param course 修改的记录
     * @return 返回影响行数
     */
    int update(Course course);

    /**
     * 修改，忽略null字段
     *
     * @param course 修改的记录
     * @return 返回影响行数
     */
    int updateIgnoreNull(Course course);

    /**
     * 删除
     *
     * @param courseNo 待删除的记录
     * @return 返回影响行数
     */
    int delete(String courseNo);

}
