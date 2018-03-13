package com.jeiker.xblog.controller;

import com.jeiker.xblog.model.Blogs;
import com.jeiker.xblog.service.BlogsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : xiao
 * @date : 2018/3/13 下午4:10
 * @description :
 */
@RestController
@RequestMapping("/api/v1/blogs")
public class BlogsController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final BlogsService blogsService;

    @Autowired
    public BlogsController(BlogsService blogsService) {
        this.blogsService = blogsService;
    }

    @GetMapping("")
    List<Blogs> list() {
        List<Blogs> blogsList = blogsService.list();
        return blogsList;
    }

    @GetMapping("/{id}")
    Blogs getById(@PathVariable("id") String id) {
        logger.info("getById id = {}", id);
        Blogs blogs = blogsService.get(id);
        return blogs;
    }

    @PostMapping("")
    int add(@RequestBody Blogs blogs) {
        int result = blogsService.add(blogs);
        return result;
    }

    @PutMapping("/{id}")
    int update(@PathVariable("id") String id, @RequestBody Blogs blogs) {
        logger.info("update id = {}", id);
        int result = blogsService.update(id, blogs);
        return result;
    }

    @DeleteMapping("/{id}")
    int delete(@PathVariable("id") String id) {
        logger.info("delete id = {}", id);
        int result = blogsService.delete(id);
        return result;
    }


}
