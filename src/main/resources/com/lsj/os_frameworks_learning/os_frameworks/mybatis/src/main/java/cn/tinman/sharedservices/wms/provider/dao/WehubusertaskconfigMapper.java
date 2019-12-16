package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wehubusertaskconfig;

public interface WehubusertaskconfigMapper {
    int insert(Wehubusertaskconfig record);

    int insertSelective(Wehubusertaskconfig record);

    Wehubusertaskconfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wehubusertaskconfig record);

    int updateByPrimaryKey(Wehubusertaskconfig record);
}