package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserOpenInfoDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserOpenInfoDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOpenInfoDoMapper {
    long countByExample(UserOpenInfoDoExample example);

    int deleteByExample(UserOpenInfoDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(UserOpenInfoDo record);

    int insertSelective(UserOpenInfoDo record);

    List<UserOpenInfoDo> selectByExample(UserOpenInfoDoExample example);

    UserOpenInfoDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") UserOpenInfoDo record,
                                 @Param("example") UserOpenInfoDoExample example);

    int updateByExample(@Param("record") UserOpenInfoDo record, @Param("example") UserOpenInfoDoExample example);

    int updateByPrimaryKeySelective(UserOpenInfoDo record);

    int updateByPrimaryKey(UserOpenInfoDo record);
}