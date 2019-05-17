package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userwechatappshare;

public interface UserwechatappshareMapper {
    int insert(Userwechatappshare record);

    int insertSelective(Userwechatappshare record);

    Userwechatappshare selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userwechatappshare record);

    int updateByPrimaryKey(Userwechatappshare record);
}