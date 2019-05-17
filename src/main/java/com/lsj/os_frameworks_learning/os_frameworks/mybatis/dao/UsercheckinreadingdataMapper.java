package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Usercheckinreadingdata;

public interface UsercheckinreadingdataMapper {
    int insert(Usercheckinreadingdata record);

    int insertSelective(Usercheckinreadingdata record);

    Usercheckinreadingdata selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usercheckinreadingdata record);

    int updateByPrimaryKey(Usercheckinreadingdata record);
}