package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userwechatlog;

public interface UserwechatlogMapper {
    int insert(Userwechatlog record);

    int insertSelective(Userwechatlog record);

    Userwechatlog selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Userwechatlog record);

    int updateByPrimaryKey(Userwechatlog record);
}