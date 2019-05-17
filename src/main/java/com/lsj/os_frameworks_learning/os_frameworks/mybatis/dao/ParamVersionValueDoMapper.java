package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.ParamVersionValueDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.ParamVersionValueDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParamVersionValueDoMapper {
    long countByExample(ParamVersionValueDoExample example);

    int deleteByExample(ParamVersionValueDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(ParamVersionValueDo record);

    int insertSelective(ParamVersionValueDo record);

    List<ParamVersionValueDo> selectByExample(ParamVersionValueDoExample example);

    ParamVersionValueDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") ParamVersionValueDo record,
                                 @Param("example") ParamVersionValueDoExample example);

    int updateByExample(@Param("record") ParamVersionValueDo record, @Param("example") ParamVersionValueDoExample example);

    int updateByPrimaryKeySelective(ParamVersionValueDo record);

    int updateByPrimaryKey(ParamVersionValueDo record);
}