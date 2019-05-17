package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserClassLogDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserClassLogDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserClassLogDoMapper {
    long countByExample(UserClassLogDoExample example);

    int deleteByExample(UserClassLogDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(UserClassLogDo record);

    int insertSelective(UserClassLogDo record);

    List<UserClassLogDo> selectByExample(UserClassLogDoExample example);

    UserClassLogDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") UserClassLogDo record,
                                 @Param("example") UserClassLogDoExample example);

    int updateByExample(@Param("record") UserClassLogDo record, @Param("example") UserClassLogDoExample example);

    int updateByPrimaryKeySelective(UserClassLogDo record);

    int updateByPrimaryKey(UserClassLogDo record);
}