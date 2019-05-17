package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.WechatInfoDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.WechatInfoDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatInfoDoMapper {
    long countByExample(WechatInfoDoExample example);

    int deleteByExample(WechatInfoDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(WechatInfoDo record);

    int insertSelective(WechatInfoDo record);

    List<WechatInfoDo> selectByExample(WechatInfoDoExample example);

    WechatInfoDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") WechatInfoDo record, @Param("example") WechatInfoDoExample example);

    int updateByExample(@Param("record") WechatInfoDo record, @Param("example") WechatInfoDoExample example);

    int updateByPrimaryKeySelective(WechatInfoDo record);

    int updateByPrimaryKey(WechatInfoDo record);
}