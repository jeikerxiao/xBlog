package com.jeiker.xblog.service;


import com.jeiker.xblog.model.Blogs;

import java.util.List;

/**
 * @author : xiao
 * @date : 2018/3/13 下午4:16
 * @description :
 */
public interface BlogsService {

    /**
     * 列表
     * @return
     */
    List<Blogs> list();

    /**
     * 根据id查找
     * @param id
     * @return
     */
    Blogs get(String id);

    /**
     * 增加
     * @param blog
     * @return
     */
    int add(Blogs blog);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(String id);

    /**
     * 更新
     * @param blog
     * @return
     */
    int update(String id, Blogs blog);

}
