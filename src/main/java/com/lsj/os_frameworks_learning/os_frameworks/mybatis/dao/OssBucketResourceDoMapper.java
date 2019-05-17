package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.OssBucketResourceDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.OssBucketResourceDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OssBucketResourceDoMapper {
    long countByExample(OssBucketResourceDoExample example);

    int deleteByExample(OssBucketResourceDoExample example);

    int deleteByPrimaryKey(Long seqId);

    int insert(OssBucketResourceDo record);

    int insertSelective(OssBucketResourceDo record);

    List<OssBucketResourceDo> selectByExample(OssBucketResourceDoExample example);

    OssBucketResourceDo selectByPrimaryKey(Long seqId);

    int updateByExampleSelective(@Param("record") OssBucketResourceDo record,
                                 @Param("example") OssBucketResourceDoExample example);

    int updateByExample(@Param("record") OssBucketResourceDo record, @Param("example") OssBucketResourceDoExample example);

    int updateByPrimaryKeySelective(OssBucketResourceDo record);

    int updateByPrimaryKey(OssBucketResourceDo record);
}