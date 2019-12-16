package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wechatuser;

public interface WechatuserMapper {
    int insert(Wechatuser record);

    int insertSelective(Wechatuser record);

    Wechatuser selectByPrimaryKey(Long wxuid);

    int updateByPrimaryKeySelective(Wechatuser record);

    int updateByPrimaryKey(Wechatuser record);
}