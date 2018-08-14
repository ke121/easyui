package com.itbaizhan.service;

import com.itbaizhan.model.MarketPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MarketService {
    int deleteByPrimaryKey(Integer id);

    int insert(MarketPO record);

    int insertSelective(MarketPO record);

    MarketPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MarketPO record);

    int updateByPrimaryKeyWithBLOBs(MarketPO record);

    int updateByPrimaryKey(MarketPO record);

    List<MarketPO> queryMarket(Integer pageNumber ,  Integer pageSize) ;

    Integer getTotal() ;
}
