package cn.tinman.sharedservices.wms.provider.dao;

import cn.tinman.sharedservices.wms.provider.model.po.Similarityimagealgorithmresult;

public interface SimilarityimagealgorithmresultMapper {
    int insert(Similarityimagealgorithmresult record);

    int insertSelective(Similarityimagealgorithmresult record);

    Similarityimagealgorithmresult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Similarityimagealgorithmresult record);

    int updateByPrimaryKey(Similarityimagealgorithmresult record);
}