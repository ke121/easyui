package com.itbaizhan.service.impl;

import com.itbaizhan.mapper.MarketPOMapper;
import com.itbaizhan.model.MarketPO;
import com.itbaizhan.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.nio.cs.ext.MacArabic;

import java.util.List;

@Service
public class MarketServiceImpl implements MarketService {

    @Autowired
    MarketPOMapper mapper ;

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(MarketPO record) {
        return 0;
    }

    public int insertSelective(MarketPO record) {
        return 0;
    }

    public MarketPO selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(MarketPO record) {
        return 0;
    }

    public int updateByPrimaryKeyWithBLOBs(MarketPO record) {
        return 0;
    }

    public int updateByPrimaryKey(MarketPO record) {
        return 0;
    }

    public List<MarketPO> queryMarket(Integer pageNumber, Integer pageSize) {
        Integer start = (pageNumber-1) * pageSize ;
        return mapper.queryMarket(start, pageSize);
    }

    public Integer getTotal() {
        return mapper.getTotal();
    }


}
