package com.jeiker.xblog.service.impl;

import com.jeiker.xblog.dao.BlogsMapper;
import com.jeiker.xblog.model.Blogs;
import com.jeiker.xblog.model.BlogsExample;
import com.jeiker.xblog.service.BlogsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : xiao
 * @date : 2018/3/13 下午4:16
 * @description :
 */
@Service
public class BlogsServiceImpl implements BlogsService{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private BlogsMapper blogsMapper;

    @Override
    public List<Blogs> list() {
        BlogsExample blogsExample = new BlogsExample();
        List<Blogs> blogsList = blogsMapper.selectByExample(blogsExample);
        return blogsList;
    }

    @Override
    public Blogs get(String id) {
        Blogs blogs = blogsMapper.selectByPrimaryKey(id);
        return blogs;
    }

    @Override
    public int add(Blogs blog) {
        int result = blogsMapper.insertSelective(blog);
        return result;
    }

    @Override
    public int delete(String id) {
        int result = blogsMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int update(String id, Blogs blog) {
        BlogsExample blogsExample = new BlogsExample();
        blogsExample.createCriteria().andIdEqualTo(id);
        int result = blogsMapper.updateByExampleSelective(blog, blogsExample);
        return result;
    }

}
