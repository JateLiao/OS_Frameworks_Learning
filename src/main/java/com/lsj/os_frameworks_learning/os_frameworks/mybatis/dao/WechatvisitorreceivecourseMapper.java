package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatvisitorreceivecourse;

public interface WechatvisitorreceivecourseMapper {
    int insert(Wechatvisitorreceivecourse record);

    int insertSelective(Wechatvisitorreceivecourse record);

    Wechatvisitorreceivecourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wechatvisitorreceivecourse record);

    int updateByPrimaryKey(Wechatvisitorreceivecourse record);
}