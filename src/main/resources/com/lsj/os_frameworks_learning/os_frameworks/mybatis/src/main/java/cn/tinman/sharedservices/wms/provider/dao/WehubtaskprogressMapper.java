package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wehubtaskprogress;

public interface WehubtaskprogressMapper {
    int insert(Wehubtaskprogress record);

    int insertSelective(Wehubtaskprogress record);

    Wehubtaskprogress selectByPrimaryKey(String taskId);

    int updateByPrimaryKeySelective(Wehubtaskprogress record);

    int updateByPrimaryKeyWithBLOBs(Wehubtaskprogress record);

    int updateByPrimaryKey(Wehubtaskprogress record);
}