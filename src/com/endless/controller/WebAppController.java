package com.endless.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.endless.entity.User;
import com.endless.service.UserService;

@Controller

public class WebAppController {
    @Autowired
    public UserService userService;

    @RequestMapping(value = "/hello.do", method = RequestMethod.GET)
    public String hello(HttpServletRequest req, Integer id) {
	System.out.println("Done!");
	User user = userService.login(id);
	System.out.println(user.toString());
	req.setAttribute("user", user);
	return "NewFile";
    }

}
