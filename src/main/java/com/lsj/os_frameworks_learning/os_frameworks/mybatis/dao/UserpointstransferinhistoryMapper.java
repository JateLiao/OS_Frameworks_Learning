package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userpointstransferinhistory;

public interface UserpointstransferinhistoryMapper {
    int insert(Userpointstransferinhistory record);

    int insertSelective(Userpointstransferinhistory record);

    Userpointstransferinhistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userpointstransferinhistory record);

    int updateByPrimaryKey(Userpointstransferinhistory record);
}