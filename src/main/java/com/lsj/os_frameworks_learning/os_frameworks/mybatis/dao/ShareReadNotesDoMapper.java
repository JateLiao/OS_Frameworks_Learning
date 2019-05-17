package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.ShareReadNotesDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.ShareReadNotesDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShareReadNotesDoMapper {
    long countByExample(ShareReadNotesDoExample example);

    int deleteByExample(ShareReadNotesDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(ShareReadNotesDo record);

    int insertSelective(ShareReadNotesDo record);

    List<ShareReadNotesDo> selectByExample(ShareReadNotesDoExample example);

    ShareReadNotesDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") ShareReadNotesDo record,
                                 @Param("example") ShareReadNotesDoExample example);

    int updateByExample(@Param("record") ShareReadNotesDo record, @Param("example") ShareReadNotesDoExample example);

    int updateByPrimaryKeySelective(ShareReadNotesDo record);

    int updateByPrimaryKey(ShareReadNotesDo record);
}