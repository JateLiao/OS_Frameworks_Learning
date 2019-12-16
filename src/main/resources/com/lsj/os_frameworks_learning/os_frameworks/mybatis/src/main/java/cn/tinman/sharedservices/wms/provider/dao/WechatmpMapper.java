package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wechatmp;

public interface WechatmpMapper {
    int insert(Wechatmp record);

    int insertSelective(Wechatmp record);

    Wechatmp selectByPrimaryKey(Long wxmpid);

    int updateByPrimaryKeySelective(Wechatmp record);

    int updateByPrimaryKey(Wechatmp record);
}