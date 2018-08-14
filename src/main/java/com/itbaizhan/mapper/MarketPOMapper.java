package com.itbaizhan.mapper;

import com.itbaizhan.model.MarketPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarketPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MarketPO record);

    int insertSelective(MarketPO record);

    MarketPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MarketPO record);

    int updateByPrimaryKeyWithBLOBs(MarketPO record);

    int updateByPrimaryKey(MarketPO record);

    List<MarketPO> queryMarket(@Param("start") Integer start , @Param("pageSize") Integer pageSize) ;

    Integer getTotal() ;
}