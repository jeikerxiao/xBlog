package com.jeiker.xblog.dao;

import com.jeiker.xblog.model.Blogs;
import com.jeiker.xblog.model.BlogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    int countByExample(BlogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    int deleteByExample(BlogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    int insert(Blogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    int insertSelective(Blogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    List<Blogs> selectByExampleWithBLOBs(BlogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    List<Blogs> selectByExample(BlogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    Blogs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Blogs record, @Param("example") BlogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Blogs record, @Param("example") BlogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Blogs record, @Param("example") BlogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Blogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Blogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogs
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Blogs record);
}