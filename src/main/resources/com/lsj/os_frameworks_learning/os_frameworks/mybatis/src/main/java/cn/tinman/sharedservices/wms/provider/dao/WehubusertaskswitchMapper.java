package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wehubusertaskswitch;

public interface WehubusertaskswitchMapper {
    int insert(Wehubusertaskswitch record);

    int insertSelective(Wehubusertaskswitch record);

    Wehubusertaskswitch selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wehubusertaskswitch record);

    int updateByPrimaryKey(Wehubusertaskswitch record);
}