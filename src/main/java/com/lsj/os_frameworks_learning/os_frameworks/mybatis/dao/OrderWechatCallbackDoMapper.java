package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.OrderWechatCallbackDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.OrderWechatCallbackDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderWechatCallbackDoMapper {
    long countByExample(OrderWechatCallbackDoExample example);

    int deleteByExample(OrderWechatCallbackDoExample example);

    int deleteByPrimaryKey(Long seqId);

    int insert(OrderWechatCallbackDo record);

    int insertSelective(OrderWechatCallbackDo record);

    List<OrderWechatCallbackDo> selectByExampleWithBLOBs(OrderWechatCallbackDoExample example);

    List<OrderWechatCallbackDo> selectByExample(OrderWechatCallbackDoExample example);

    OrderWechatCallbackDo selectByPrimaryKey(Long seqId);

    int updateByExampleSelective(@Param("record") OrderWechatCallbackDo record,
                                 @Param("example") OrderWechatCallbackDoExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderWechatCallbackDo record, @Param("example") OrderWechatCallbackDoExample example);

    int updateByExample(@Param("record") OrderWechatCallbackDo record, @Param("example") OrderWechatCallbackDoExample example);

    int updateByPrimaryKeySelective(OrderWechatCallbackDo record);

    int updateByPrimaryKeyWithBLOBs(OrderWechatCallbackDo record);

    int updateByPrimaryKey(OrderWechatCallbackDo record);
}