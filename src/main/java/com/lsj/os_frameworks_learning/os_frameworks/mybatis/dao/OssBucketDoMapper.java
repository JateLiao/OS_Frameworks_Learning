package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.OssBucketDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.OssBucketDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OssBucketDoMapper {
    long countByExample(OssBucketDoExample example);

    int deleteByExample(OssBucketDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(OssBucketDo record);

    int insertSelective(OssBucketDo record);

    List<OssBucketDo> selectByExample(OssBucketDoExample example);

    OssBucketDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") OssBucketDo record, @Param("example") OssBucketDoExample example);

    int updateByExample(@Param("record") OssBucketDo record, @Param("example") OssBucketDoExample example);

    int updateByPrimaryKeySelective(OssBucketDo record);

    int updateByPrimaryKey(OssBucketDo record);
}