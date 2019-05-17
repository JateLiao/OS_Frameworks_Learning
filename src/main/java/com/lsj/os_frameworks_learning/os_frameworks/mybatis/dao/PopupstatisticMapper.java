package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Popupstatistic;

public interface PopupstatisticMapper {
    int insert(Popupstatistic record);

    int insertSelective(Popupstatistic record);

    Popupstatistic selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(Popupstatistic record);

    int updateByPrimaryKey(Popupstatistic record);
}