package com.lei.dao;

import com.lei.pojo.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer orderDetailId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer orderDetailId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}