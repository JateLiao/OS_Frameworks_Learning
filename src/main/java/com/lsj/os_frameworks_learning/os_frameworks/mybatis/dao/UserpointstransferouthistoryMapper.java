package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userpointstransferouthistory;

public interface UserpointstransferouthistoryMapper {
    int insert(Userpointstransferouthistory record);

    int insertSelective(Userpointstransferouthistory record);

    Userpointstransferouthistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userpointstransferouthistory record);

    int updateByPrimaryKey(Userpointstransferouthistory record);
}