package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Popupbox;

public interface PopupboxMapper {
    int insert(Popupbox record);

    int insertSelective(Popupbox record);

    Popupbox selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Popupbox record);

    int updateByPrimaryKey(Popupbox record);
}