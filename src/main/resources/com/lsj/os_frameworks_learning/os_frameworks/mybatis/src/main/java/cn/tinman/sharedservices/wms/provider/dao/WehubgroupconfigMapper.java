package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wehubgroupconfig;

public interface WehubgroupconfigMapper {
    int insert(Wehubgroupconfig record);

    int insertSelective(Wehubgroupconfig record);

    Wehubgroupconfig selectByPrimaryKey(Long whgid);

    int updateByPrimaryKeySelective(Wehubgroupconfig record);

    int updateByPrimaryKey(Wehubgroupconfig record);
}