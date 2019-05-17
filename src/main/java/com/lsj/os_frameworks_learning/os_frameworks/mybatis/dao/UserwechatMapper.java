package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userwechat;

public interface UserwechatMapper {
    int insert(Userwechat record);

    int insertSelective(Userwechat record);

    Userwechat selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Userwechat record);

    int updateByPrimaryKey(Userwechat record);
}