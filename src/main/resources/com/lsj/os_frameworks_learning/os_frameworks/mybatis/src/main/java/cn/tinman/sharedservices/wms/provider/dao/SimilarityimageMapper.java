package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Similarityimage;

public interface SimilarityimageMapper {
    int insert(Similarityimage record);

    int insertSelective(Similarityimage record);

    Similarityimage selectByPrimaryKey(Long imageId);

    int updateByPrimaryKeySelective(Similarityimage record);

    int updateByPrimaryKey(Similarityimage record);
}