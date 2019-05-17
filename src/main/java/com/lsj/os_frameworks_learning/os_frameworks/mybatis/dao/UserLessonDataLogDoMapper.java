package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserLessonDataLogDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserLessonDataLogDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLessonDataLogDoMapper {
    long countByExample(UserLessonDataLogDoExample example);

    int deleteByExample(UserLessonDataLogDoExample example);

    int deleteByPrimaryKey(Long seqId);

    int insert(UserLessonDataLogDo record);

    int insertSelective(UserLessonDataLogDo record);

    List<UserLessonDataLogDo> selectByExample(UserLessonDataLogDoExample example);

    UserLessonDataLogDo selectByPrimaryKey(Long seqId);

    int updateByExampleSelective(@Param("record") UserLessonDataLogDo record,
                                 @Param("example") UserLessonDataLogDoExample example);

    int updateByExample(@Param("record") UserLessonDataLogDo record, @Param("example") UserLessonDataLogDoExample example);

    int updateByPrimaryKeySelective(UserLessonDataLogDo record);

    int updateByPrimaryKey(UserLessonDataLogDo record);
}