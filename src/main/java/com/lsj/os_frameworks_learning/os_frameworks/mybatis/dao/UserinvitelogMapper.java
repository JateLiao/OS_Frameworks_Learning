package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userinvitelog;

public interface UserinvitelogMapper {
    int insert(Userinvitelog record);

    int insertSelective(Userinvitelog record);

    Userinvitelog selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(Userinvitelog record);

    int updateByPrimaryKey(Userinvitelog record);
}