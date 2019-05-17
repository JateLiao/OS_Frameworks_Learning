package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserLessonScoreLogDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.UserLessonScoreLogDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLessonScoreLogDoMapper {
    long countByExample(UserLessonScoreLogDoExample example);

    int deleteByExample(UserLessonScoreLogDoExample example);

    int deleteByPrimaryKey(Long seqId);

    int insert(UserLessonScoreLogDo record);

    int insertSelective(UserLessonScoreLogDo record);

    List<UserLessonScoreLogDo> selectByExample(UserLessonScoreLogDoExample example);

    UserLessonScoreLogDo selectByPrimaryKey(Long seqId);

    int updateByExampleSelective(@Param("record") UserLessonScoreLogDo record,
                                 @Param("example") UserLessonScoreLogDoExample example);

    int updateByExample(@Param("record") UserLessonScoreLogDo record, @Param("example") UserLessonScoreLogDoExample example);

    int updateByPrimaryKeySelective(UserLessonScoreLogDo record);

    int updateByPrimaryKey(UserLessonScoreLogDo record);
}