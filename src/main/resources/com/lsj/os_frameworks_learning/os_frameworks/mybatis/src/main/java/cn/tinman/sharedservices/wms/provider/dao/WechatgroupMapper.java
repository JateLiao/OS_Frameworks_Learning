package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wechatgroup;

public interface WechatgroupMapper {
    int insert(Wechatgroup record);

    int insertSelective(Wechatgroup record);

    Wechatgroup selectByPrimaryKey(Long wxgid);

    int updateByPrimaryKeySelective(Wechatgroup record);

    int updateByPrimaryKey(Wechatgroup record);
}