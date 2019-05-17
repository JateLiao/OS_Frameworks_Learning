package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserLessonScoreDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserLessonScoreDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLessonScoreDoMapper {
    long countByExample(UserLessonScoreDoExample example);

    int deleteByExample(UserLessonScoreDoExample example);

    int deleteByPrimaryKey(Long seqId);

    int insert(UserLessonScoreDo record);

    int insertSelective(UserLessonScoreDo record);

    List<UserLessonScoreDo> selectByExample(UserLessonScoreDoExample example);

    UserLessonScoreDo selectByPrimaryKey(Long seqId);

    int updateByExampleSelective(@Param("record") UserLessonScoreDo record,
                                 @Param("example") UserLessonScoreDoExample example);

    int updateByExample(@Param("record") UserLessonScoreDo record, @Param("example") UserLessonScoreDoExample example);

    int updateByPrimaryKeySelective(UserLessonScoreDo record);

    int updateByPrimaryKey(UserLessonScoreDo record);
}