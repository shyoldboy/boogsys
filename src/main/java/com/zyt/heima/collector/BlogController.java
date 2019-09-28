package com.zyt.heima.collector;

import com.zyt.heima.dao.BlogDao;
import com.zyt.heima.entity.Blog;
import com.zyt.heima.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;
    @RequestMapping("/insert")
    public boolean insertBlog(Blog blog){
        int i;
        try {
            i = blogService.insert(blog);
        }catch(Exception e){
            return false;
        }
        return i >= 0?true:false;
    }
    @RequestMapping("/update")
    public boolean updateBlog(Blog blog){
        int i;
        try {
            i = blogService.update(blog);
        }catch(Exception e){
            return false;
        }
        return i >= 0?true:false;
    }
    @ResponseBody
    @RequestMapping("/findById")
    public Blog findById(String blogid){
        return (Blog) blogService.findById(blogid);
    }

}
