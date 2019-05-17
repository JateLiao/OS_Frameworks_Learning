package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Paramversionvalueallowip;

public interface ParamversionvalueallowipMapper {
    int insert(Paramversionvalueallowip record);

    int insertSelective(Paramversionvalueallowip record);

    Paramversionvalueallowip selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Paramversionvalueallowip record);

    int updateByPrimaryKey(Paramversionvalueallowip record);
}