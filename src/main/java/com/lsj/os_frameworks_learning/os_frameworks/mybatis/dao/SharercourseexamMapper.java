package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Sharercourseexam;

public interface SharercourseexamMapper {
    int insert(Sharercourseexam record);

    int insertSelective(Sharercourseexam record);

    Sharercourseexam selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Sharercourseexam record);

    int updateByPrimaryKey(Sharercourseexam record);
}