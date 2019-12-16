package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wehubauthgroupconfig;

public interface WehubauthgroupconfigMapper {
    int insert(Wehubauthgroupconfig record);

    int insertSelective(Wehubauthgroupconfig record);

    Wehubauthgroupconfig selectByPrimaryKey(Long wxgid);
}