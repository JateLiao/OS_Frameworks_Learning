package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Popupstrategy;

public interface PopupstrategyMapper {
    int insert(Popupstrategy record);

    int insertSelective(Popupstrategy record);

    Popupstrategy selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(Popupstrategy record);

    int updateByPrimaryKey(Popupstrategy record);
}