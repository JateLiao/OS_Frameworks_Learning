package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserWechatDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserWechatDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWechatDoMapper {
    long countByExample(UserWechatDoExample example);

    int deleteByExample(UserWechatDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(UserWechatDo record);

    int insertSelective(UserWechatDo record);

    List<UserWechatDo> selectByExample(UserWechatDoExample example);

    UserWechatDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") UserWechatDo record, @Param("example") UserWechatDoExample example);

    int updateByExample(@Param("record") UserWechatDo record, @Param("example") UserWechatDoExample example);

    int updateByPrimaryKeySelective(UserWechatDo record);

    int updateByPrimaryKey(UserWechatDo record);
}