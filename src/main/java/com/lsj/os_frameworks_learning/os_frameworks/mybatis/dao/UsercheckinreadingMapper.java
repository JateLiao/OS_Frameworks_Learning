package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Usercheckinreading;

public interface UsercheckinreadingMapper {
    int insert(Usercheckinreading record);

    int insertSelective(Usercheckinreading record);

    Usercheckinreading selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usercheckinreading record);

    int updateByPrimaryKey(Usercheckinreading record);
}