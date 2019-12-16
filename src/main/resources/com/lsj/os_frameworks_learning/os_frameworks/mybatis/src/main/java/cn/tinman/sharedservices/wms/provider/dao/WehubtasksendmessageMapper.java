package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wehubtasksendmessage;
import cn.tinman.sharedservices.wms.provider.model.po.WehubtasksendmessageWithBLOBs;

public interface WehubtasksendmessageMapper {
    int insert(WehubtasksendmessageWithBLOBs record);

    int insertSelective(WehubtasksendmessageWithBLOBs record);

    WehubtasksendmessageWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WehubtasksendmessageWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WehubtasksendmessageWithBLOBs record);

    int updateByPrimaryKey(Wehubtasksendmessage record);
}