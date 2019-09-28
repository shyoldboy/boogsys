package com.zyt.heima.service;

import com.zyt.heima.dao.BlogDao;
import com.zyt.heima.entity.Blog;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements InitializingBean {
    @Autowired
    SqlSession sqlSession;

    private  BlogDao blogDao;

    public int insert(Blog blog){
        return  blogDao.insert(blog);
    }
    public  int update(Blog blog){
        return blogDao.updateByPrimaryKey(blog);
    }
    public Blog findById(String blogId){
        return blogDao.selectByPrimaryKey(blogId);
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        blogDao = sqlSession.getMapper(BlogDao.class);
    }
}