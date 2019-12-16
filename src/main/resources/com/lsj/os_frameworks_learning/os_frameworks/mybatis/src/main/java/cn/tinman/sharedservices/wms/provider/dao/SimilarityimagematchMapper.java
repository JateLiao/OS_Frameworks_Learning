package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Similarityimagematch;

public interface SimilarityimagematchMapper {
    int insert(Similarityimagematch record);

    int insertSelective(Similarityimagematch record);

    Similarityimagematch selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Similarityimagematch record);

    int updateByPrimaryKey(Similarityimagematch record);
}