package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.ShareCourseExamDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.ShareCourseExamDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShareCourseExamDoMapper {
    long countByExample(ShareCourseExamDoExample example);

    int deleteByExample(ShareCourseExamDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(ShareCourseExamDo record);

    int insertSelective(ShareCourseExamDo record);

    List<ShareCourseExamDo> selectByExample(ShareCourseExamDoExample example);

    ShareCourseExamDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") ShareCourseExamDo record,
                                 @Param("example") ShareCourseExamDoExample example);

    int updateByExample(@Param("record") ShareCourseExamDo record, @Param("example") ShareCourseExamDoExample example);

    int updateByPrimaryKeySelective(ShareCourseExamDo record);

    int updateByPrimaryKey(ShareCourseExamDo record);
}