package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Orderusercourseaffiliate;

public interface OrderusercourseaffiliateMapper {
    int insert(Orderusercourseaffiliate record);

    int insertSelective(Orderusercourseaffiliate record);

    Orderusercourseaffiliate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orderusercourseaffiliate record);

    int updateByPrimaryKey(Orderusercourseaffiliate record);
}