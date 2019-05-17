package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Shorturl;

public interface ShorturlMapper {
    int insert(Shorturl record);

    int insertSelective(Shorturl record);

    Shorturl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Shorturl record);

    int updateByPrimaryKey(Shorturl record);
}