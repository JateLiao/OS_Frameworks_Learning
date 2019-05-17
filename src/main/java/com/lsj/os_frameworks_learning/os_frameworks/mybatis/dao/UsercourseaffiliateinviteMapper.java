package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Usercourseaffiliateinvite;

public interface UsercourseaffiliateinviteMapper {
    int insert(Usercourseaffiliateinvite record);

    int insertSelective(Usercourseaffiliateinvite record);

    Usercourseaffiliateinvite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usercourseaffiliateinvite record);

    int updateByPrimaryKey(Usercourseaffiliateinvite record);
}