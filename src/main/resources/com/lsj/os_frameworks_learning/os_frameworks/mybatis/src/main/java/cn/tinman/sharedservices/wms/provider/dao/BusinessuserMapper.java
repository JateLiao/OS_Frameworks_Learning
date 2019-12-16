package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Businessuser;

public interface BusinessuserMapper {
    int insert(Businessuser record);

    int insertSelective(Businessuser record);

    Businessuser selectByPrimaryKey(Long buid);

    int updateByPrimaryKeySelective(Businessuser record);

    int updateByPrimaryKey(Businessuser record);
}