package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Orderpayyouzanorderexchange;

public interface OrderpayyouzanorderexchangeMapper {
    int insert(Orderpayyouzanorderexchange record);

    int insertSelective(Orderpayyouzanorderexchange record);

    Orderpayyouzanorderexchange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orderpayyouzanorderexchange record);

    int updateByPrimaryKeyWithBLOBs(Orderpayyouzanorderexchange record);

    int updateByPrimaryKey(Orderpayyouzanorderexchange record);
}