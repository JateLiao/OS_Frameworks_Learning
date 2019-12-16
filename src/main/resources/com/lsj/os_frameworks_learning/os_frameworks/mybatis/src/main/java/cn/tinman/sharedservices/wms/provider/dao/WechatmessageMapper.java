package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wechatmessage;

public interface WechatmessageMapper {
    int insert(Wechatmessage record);

    int insertSelective(Wechatmessage record);

    Wechatmessage selectByPrimaryKey(Long messageId);

    int updateByPrimaryKeySelective(Wechatmessage record);

    int updateByPrimaryKeyWithBLOBs(Wechatmessage record);

    int updateByPrimaryKey(Wechatmessage record);
}