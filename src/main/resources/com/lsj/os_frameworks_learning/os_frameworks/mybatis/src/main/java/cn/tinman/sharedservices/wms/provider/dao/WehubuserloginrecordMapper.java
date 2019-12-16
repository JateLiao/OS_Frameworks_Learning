package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Wehubuserloginrecord;

public interface WehubuserloginrecordMapper {
    int insert(Wehubuserloginrecord record);

    int insertSelective(Wehubuserloginrecord record);

    Wehubuserloginrecord selectByPrimaryKey(Long recordId);

    int updateByPrimaryKeySelective(Wehubuserloginrecord record);

    int updateByPrimaryKey(Wehubuserloginrecord record);
}