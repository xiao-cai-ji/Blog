package com.mxb.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Meng
 * @data 2022/6/16 14:54
 */
@Controller
@RequestMapping("/admin")
public class BlogController {
    @RequestMapping("/blogs")
    public String blogs(){
        return "/admin/blogs";
    }
}
