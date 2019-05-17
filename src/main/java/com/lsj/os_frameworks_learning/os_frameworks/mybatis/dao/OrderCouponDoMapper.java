package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.OrderCouponDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.OrderCouponDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCouponDoMapper {
    long countByExample(OrderCouponDoExample example);

    int deleteByExample(OrderCouponDoExample example);

    int deleteByPrimaryKey(Long seqId);

    int insert(OrderCouponDo record);

    int insertSelective(OrderCouponDo record);

    List<OrderCouponDo> selectByExample(OrderCouponDoExample example);

    OrderCouponDo selectByPrimaryKey(Long seqId);

    int updateByExampleSelective(@Param("record") OrderCouponDo record, @Param("example") OrderCouponDoExample example);

    int updateByExample(@Param("record") OrderCouponDo record, @Param("example") OrderCouponDoExample example);

    int updateByPrimaryKeySelective(OrderCouponDo record);

    int updateByPrimaryKey(OrderCouponDo record);
}