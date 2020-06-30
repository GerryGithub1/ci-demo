package com.example.cidemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 欢迎来到牧码人教育，做Java我们是专业的
 *
 * @创建人： 牧码人教育-Gerry
 * @创建时间： 2020-6-30
 * @功能描述：
 */
@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("add")
    public String add() {
        return "user added";
    }

    @RequestMapping("del")
    public String del() {
        return "user deleted";
    }
}
