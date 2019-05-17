package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userwechatmpqr;

public interface UserwechatmpqrMapper {
    int insert(Userwechatmpqr record);

    int insertSelective(Userwechatmpqr record);

    Userwechatmpqr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userwechatmpqr record);

    int updateByPrimaryKey(Userwechatmpqr record);
}