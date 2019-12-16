package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wechatmessageat;

public interface WechatmessageatMapper {
    int insert(Wechatmessageat record);

    int insertSelective(Wechatmessageat record);

    Wechatmessageat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatmessageat record);

    int updateByPrimaryKey(Wechatmessageat record);
}