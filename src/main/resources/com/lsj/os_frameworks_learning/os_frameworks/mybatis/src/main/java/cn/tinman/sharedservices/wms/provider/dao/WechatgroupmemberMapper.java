package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wechatgroupmember;

public interface WechatgroupmemberMapper {
    int insert(Wechatgroupmember record);

    int insertSelective(Wechatgroupmember record);

    Wechatgroupmember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatgroupmember record);

    int updateByPrimaryKey(Wechatgroupmember record);
}