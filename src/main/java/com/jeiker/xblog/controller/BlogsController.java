package com.jeiker.xblog.controller;

import com.jeiker.xblog.dao.BlogsMapper;
import com.jeiker.xblog.model.Blogs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : xiao
 * @date : 2018/3/13 下午4:10
 * @description :
 */
@RestController
@RequestMapping("/api/v1/blogs")
public class BlogsController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private BlogsMapper blogsMapper;

    @GetMapping("/{id}")
    Blogs findCityById(@PathVariable("id") String id) {

        logger.info("findCityById id = {}", id);

        Blogs blogs = blogsMapper.selectByPrimaryKey(id);
        return blogs;
    }
}
