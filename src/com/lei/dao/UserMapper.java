package com.lei.dao;

import com.lei.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer ssmUserId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer ssmUserId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}