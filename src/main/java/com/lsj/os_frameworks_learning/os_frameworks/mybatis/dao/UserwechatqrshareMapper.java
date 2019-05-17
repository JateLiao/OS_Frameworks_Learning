package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userwechatqrshare;

public interface UserwechatqrshareMapper {
    int insert(Userwechatqrshare record);

    int insertSelective(Userwechatqrshare record);

    Userwechatqrshare selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userwechatqrshare record);

    int updateByPrimaryKey(Userwechatqrshare record);
}