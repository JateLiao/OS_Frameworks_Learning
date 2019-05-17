package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.ClassScheduleItemDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.ClassScheduleItemDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassScheduleItemDoMapper {
    long countByExample(ClassScheduleItemDoExample example);

    int deleteByExample(ClassScheduleItemDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(ClassScheduleItemDo record);

    int insertSelective(ClassScheduleItemDo record);

    List<ClassScheduleItemDo> selectByExample(ClassScheduleItemDoExample example);

    ClassScheduleItemDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") ClassScheduleItemDo record,
                                 @Param("example") ClassScheduleItemDoExample example);

    int updateByExample(@Param("record") ClassScheduleItemDo record, @Param("example") ClassScheduleItemDoExample example);

    int updateByPrimaryKeySelective(ClassScheduleItemDo record);

    int updateByPrimaryKey(ClassScheduleItemDo record);
}