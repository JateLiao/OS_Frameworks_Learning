package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wehubexchangemessage;

public interface WehubexchangemessageMapper {
    int insert(Wehubexchangemessage record);

    int insertSelective(Wehubexchangemessage record);

    Wehubexchangemessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wehubexchangemessage record);

    int updateByPrimaryKeyWithBLOBs(Wehubexchangemessage record);

    int updateByPrimaryKey(Wehubexchangemessage record);
}