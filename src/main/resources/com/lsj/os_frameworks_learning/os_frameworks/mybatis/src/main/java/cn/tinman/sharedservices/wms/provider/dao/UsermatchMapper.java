package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Usermatch;

public interface UsermatchMapper {
    int insert(Usermatch record);

    int insertSelective(Usermatch record);

    Usermatch selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Usermatch record);

    int updateByPrimaryKey(Usermatch record);
}