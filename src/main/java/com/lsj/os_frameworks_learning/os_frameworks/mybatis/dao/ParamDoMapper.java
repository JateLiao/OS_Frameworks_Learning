package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.ParamDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.ParamDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParamDoMapper {
    long countByExample(ParamDoExample example);

    int deleteByExample(ParamDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(ParamDo record);

    int insertSelective(ParamDo record);

    List<ParamDo> selectByExample(ParamDoExample example);

    ParamDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") ParamDo record, @Param("example") ParamDoExample example);

    int updateByExample(@Param("record") ParamDo record, @Param("example") ParamDoExample example);

    int updateByPrimaryKeySelective(ParamDo record);

    int updateByPrimaryKey(ParamDo record);
}