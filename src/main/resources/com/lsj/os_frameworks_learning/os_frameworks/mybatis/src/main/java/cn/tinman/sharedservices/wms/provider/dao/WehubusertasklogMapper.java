package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wehubusertasklog;

public interface WehubusertasklogMapper {
    int insert(Wehubusertasklog record);

    int insertSelective(Wehubusertasklog record);

    Wehubusertasklog selectByPrimaryKey(Long logId);

    int updateByPrimaryKeySelective(Wehubusertasklog record);

    int updateByPrimaryKey(Wehubusertasklog record);
}