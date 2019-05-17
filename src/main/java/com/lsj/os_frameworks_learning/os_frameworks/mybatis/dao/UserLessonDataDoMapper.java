package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserLessonDataDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserLessonDataDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLessonDataDoMapper {
    long countByExample(UserLessonDataDoExample example);

    int deleteByExample(UserLessonDataDoExample example);

    int deleteByPrimaryKey(Long seqId);

    int insert(UserLessonDataDo record);

    int insertSelective(UserLessonDataDo record);

    List<UserLessonDataDo> selectByExample(UserLessonDataDoExample example);

    UserLessonDataDo selectByPrimaryKey(Long seqId);

    int updateByExampleSelective(@Param("record") UserLessonDataDo record,
                                 @Param("example") UserLessonDataDoExample example);

    int updateByExample(@Param("record") UserLessonDataDo record, @Param("example") UserLessonDataDoExample example);

    int updateByPrimaryKeySelective(UserLessonDataDo record);

    int updateByPrimaryKey(UserLessonDataDo record);
}