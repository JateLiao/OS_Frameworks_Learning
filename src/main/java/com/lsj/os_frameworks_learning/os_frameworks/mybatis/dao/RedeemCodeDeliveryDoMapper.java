package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.RedeemCodeDeliveryDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.RedeemCodeDeliveryDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedeemCodeDeliveryDoMapper {
    long countByExample(RedeemCodeDeliveryDoExample example);

    int deleteByExample(RedeemCodeDeliveryDoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RedeemCodeDeliveryDo record);

    int insertSelective(RedeemCodeDeliveryDo record);

    List<RedeemCodeDeliveryDo> selectByExample(RedeemCodeDeliveryDoExample example);

    RedeemCodeDeliveryDo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RedeemCodeDeliveryDo record,
                                 @Param("example") RedeemCodeDeliveryDoExample example);

    int updateByExample(@Param("record") RedeemCodeDeliveryDo record, @Param("example") RedeemCodeDeliveryDoExample example);

    int updateByPrimaryKeySelective(RedeemCodeDeliveryDo record);

    int updateByPrimaryKey(RedeemCodeDeliveryDo record);
}