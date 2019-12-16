package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wechatmessagelink;

public interface WechatmessagelinkMapper {
    int insert(Wechatmessagelink record);

    int insertSelective(Wechatmessagelink record);

    Wechatmessagelink selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatmessagelink record);

    int updateByPrimaryKey(Wechatmessagelink record);
}