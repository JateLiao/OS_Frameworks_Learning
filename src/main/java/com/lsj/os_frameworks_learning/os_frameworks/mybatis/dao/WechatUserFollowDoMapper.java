package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.WechatUserFollowDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.WechatUserFollowDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatUserFollowDoMapper {
    long countByExample(WechatUserFollowDoExample example);

    int deleteByExample(WechatUserFollowDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(WechatUserFollowDo record);

    int insertSelective(WechatUserFollowDo record);

    List<WechatUserFollowDo> selectByExample(WechatUserFollowDoExample example);

    WechatUserFollowDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") WechatUserFollowDo record,
                                 @Param("example") WechatUserFollowDoExample example);

    int updateByExample(@Param("record") WechatUserFollowDo record, @Param("example") WechatUserFollowDoExample example);

    int updateByPrimaryKeySelective(WechatUserFollowDo record);

    int updateByPrimaryKey(WechatUserFollowDo record);
}