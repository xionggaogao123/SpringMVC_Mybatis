package com.endless.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endless.dao.UserMapper;
import com.endless.entity.User;

@Service
public class UserService {
    @Autowired
    UserMapper mapper;

    public User login(Integer id) {
	User user = mapper.getOne(id);
	return user;
    }
}
