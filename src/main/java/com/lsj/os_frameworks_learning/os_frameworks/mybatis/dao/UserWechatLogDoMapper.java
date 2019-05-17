package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserWechatLogDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserWechatLogDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWechatLogDoMapper {
    long countByExample(UserWechatLogDoExample example);

    int deleteByExample(UserWechatLogDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(UserWechatLogDo record);

    int insertSelective(UserWechatLogDo record);

    List<UserWechatLogDo> selectByExample(UserWechatLogDoExample example);

    UserWechatLogDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") UserWechatLogDo record,
                                 @Param("example") UserWechatLogDoExample example);

    int updateByExample(@Param("record") UserWechatLogDo record, @Param("example") UserWechatLogDoExample example);

    int updateByPrimaryKeySelective(UserWechatLogDo record);

    int updateByPrimaryKey(UserWechatLogDo record);
}