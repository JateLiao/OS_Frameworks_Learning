package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wechatuserfriends;

public interface WechatuserfriendsMapper {
    int insert(Wechatuserfriends record);

    int insertSelective(Wechatuserfriends record);

    Wechatuserfriends selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatuserfriends record);

    int updateByPrimaryKey(Wechatuserfriends record);
}