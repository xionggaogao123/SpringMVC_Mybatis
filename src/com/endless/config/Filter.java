package com.endless.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.CharacterEncodingFilter;

//@WebFilter(filterName = "filter", urlPatterns = "/*")
public class Filter extends CharacterEncodingFilter implements javax.servlet.Filter {
    @Override
    public void setEncoding(String encoding) {
	System.out.println("设置字符集");
	super.setEncoding(encoding);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
	    throws ServletException, IOException {
	setEncoding("utf-8");
	super.doFilterInternal(request, response, filterChain);
    }

}
