package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Lessonquestionanwser;

public interface LessonquestionanwserMapper {
    int insert(Lessonquestionanwser record);

    int insertSelective(Lessonquestionanwser record);

    Lessonquestionanwser selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Lessonquestionanwser record);

    int updateByPrimaryKey(Lessonquestionanwser record);
}