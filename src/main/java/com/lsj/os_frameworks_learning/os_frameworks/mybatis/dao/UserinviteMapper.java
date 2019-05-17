package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userinvite;

public interface UserinviteMapper {
    int insert(Userinvite record);

    int insertSelective(Userinvite record);

    Userinvite selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(Userinvite record);

    int updateByPrimaryKey(Userinvite record);
}