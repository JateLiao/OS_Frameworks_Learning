package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.BetaListDO;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.BetaListDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BetaListDOMapper {
    long countByExample(BetaListDOExample example);

    int deleteByExample(BetaListDOExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(BetaListDO record);

    int insertSelective(BetaListDO record);

    List<BetaListDO> selectByExample(BetaListDOExample example);

    BetaListDO selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") BetaListDO record, @Param("example") BetaListDOExample example);

    int updateByExample(@Param("record") BetaListDO record, @Param("example") BetaListDOExample example);

    int updateByPrimaryKeySelective(BetaListDO record);

    int updateByPrimaryKey(BetaListDO record);
}