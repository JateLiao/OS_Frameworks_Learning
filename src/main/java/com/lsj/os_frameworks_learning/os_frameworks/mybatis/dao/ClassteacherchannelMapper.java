package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Classteacherchannel;

public interface ClassteacherchannelMapper {
    int insert(Classteacherchannel record);

    int insertSelective(Classteacherchannel record);

    Classteacherchannel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classteacherchannel record);

    int updateByPrimaryKey(Classteacherchannel record);
}