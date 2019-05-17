package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.ProductCourseSkuCourseDo;
import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.ProductCourseSkuCourseDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCourseSkuCourseDoMapper {
    long countByExample(ProductCourseSkuCourseDoExample example);

    int deleteByExample(ProductCourseSkuCourseDoExample example);

    int deleteByPrimaryKey(Integer seqId);

    int insert(ProductCourseSkuCourseDo record);

    int insertSelective(ProductCourseSkuCourseDo record);

    List<ProductCourseSkuCourseDo> selectByExample(ProductCourseSkuCourseDoExample example);

    ProductCourseSkuCourseDo selectByPrimaryKey(Integer seqId);

    int updateByExampleSelective(@Param("record") ProductCourseSkuCourseDo record,
                                 @Param("example") ProductCourseSkuCourseDoExample example);

    int updateByExample(@Param("record") ProductCourseSkuCourseDo record, @Param("example") ProductCourseSkuCourseDoExample example);

    int updateByPrimaryKeySelective(ProductCourseSkuCourseDo record);

    int updateByPrimaryKey(ProductCourseSkuCourseDo record);
}