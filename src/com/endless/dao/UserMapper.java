package com.endless.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.endless.entity.User;

//@isMappers
public interface UserMapper {
    @Select("select * from users")
    @Results({ @Result(property = "name", column = "name"), @Result(property = "age", column = "age")

    })
    List<User> getAll();

    @Select("SELECT * FROM users WHERE uid = #{uid}")
    @Results({ @Result(property = "name", column = "name"), @Result(property = "age", column = "age")

    })
    User getOne(Integer id);
}
