package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wehubuser;

public interface WehubuserMapper {
    int insert(Wehubuser record);

    int insertSelective(Wehubuser record);

    Wehubuser selectByPrimaryKey(Long whuid);

    int updateByPrimaryKeySelective(Wehubuser record);

    int updateByPrimaryKey(Wehubuser record);
}