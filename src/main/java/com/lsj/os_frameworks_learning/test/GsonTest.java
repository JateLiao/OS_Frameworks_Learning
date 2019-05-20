package com.lsj.os_frameworks_learning.test;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.BetaListDO;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import utils.CommonGsonUtil;

import java.util.Date;

/**
 * @author Administrator
 * @description: ${TODO}
 * @Createtime 2019/5/2017:03
 */
public class GsonTest {
    
    @Test
    public void gsonDateTest() {
        BetaListDO betaListDO = new BetaListDO();
        betaListDO.setCreateTime(new Date());
        
        System.out.println("转Json：" + CommonGsonUtil.toJson(betaListDO));
    
        String json = "{\"createTime\":\"2018-10-10\"}";
        BetaListDO listDO = CommonGsonUtil.fromJson(json, BetaListDO.class);
        System.out.println(listDO.getCreateTime());
    }
}
