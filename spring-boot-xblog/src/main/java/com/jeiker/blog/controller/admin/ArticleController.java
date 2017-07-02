package com.jeiker.blog.controller.admin;

import com.jeiker.blog.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : xiao
 * @Date : 17/7/2 上午11:22
 */
@RestController
@RequestMapping("/amdin/article")
public class ArticleController extends BaseController{

    private static final Logger LOGGER = LoggerFactory.getLogger(ArticleController.class);

}
