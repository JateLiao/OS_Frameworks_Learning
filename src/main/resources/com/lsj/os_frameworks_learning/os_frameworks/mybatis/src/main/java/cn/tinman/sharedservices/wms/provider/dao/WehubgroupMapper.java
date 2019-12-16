package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wehubgroup;

public interface WehubgroupMapper {
    int insert(Wehubgroup record);

    int insertSelective(Wehubgroup record);

    Wehubgroup selectByPrimaryKey(Long whgid);

    int updateByPrimaryKeySelective(Wehubgroup record);

    int updateByPrimaryKey(Wehubgroup record);
}