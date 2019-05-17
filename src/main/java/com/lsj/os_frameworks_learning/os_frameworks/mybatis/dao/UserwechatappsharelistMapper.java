package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userwechatappsharelist;

public interface UserwechatappsharelistMapper {
    int insert(Userwechatappsharelist record);

    int insertSelective(Userwechatappsharelist record);

    Userwechatappsharelist selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userwechatappsharelist record);

    int updateByPrimaryKey(Userwechatappsharelist record);
}