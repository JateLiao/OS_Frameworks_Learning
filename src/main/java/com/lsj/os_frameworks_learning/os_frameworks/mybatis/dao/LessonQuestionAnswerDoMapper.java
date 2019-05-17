package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.LessonQuestionAnswerDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.LessonQuestionAnswerDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LessonQuestionAnswerDoMapper {
    long countByExample(LessonQuestionAnswerDoExample example);

    int deleteByExample(LessonQuestionAnswerDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(LessonQuestionAnswerDo record);

    int insertSelective(LessonQuestionAnswerDo record);

    List<LessonQuestionAnswerDo> selectByExample(LessonQuestionAnswerDoExample example);

    LessonQuestionAnswerDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") LessonQuestionAnswerDo record,
                                 @Param("example") LessonQuestionAnswerDoExample example);

    int updateByExample(@Param("record") LessonQuestionAnswerDo record, @Param("example") LessonQuestionAnswerDoExample example);

    int updateByPrimaryKeySelective(LessonQuestionAnswerDo record);

    int updateByPrimaryKey(LessonQuestionAnswerDo record);
}