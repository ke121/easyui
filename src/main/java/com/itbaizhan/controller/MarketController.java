package com.itbaizhan.controller;

import com.itbaizhan.model.DgData;
import com.itbaizhan.model.MarketPO;
import com.itbaizhan.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MarketController {
    @Autowired
    MarketService marketService ;
    @GetMapping("/queryMarket")
    public DgData  queryMarket(@RequestParam(required = false,defaultValue = "1") Integer page , @RequestParam(required = false,defaultValue = "5") Integer rows){
        List<MarketPO> list = marketService.queryMarket(page, rows);
        Integer total = marketService.getTotal();
        DgData dgData = new DgData() ;
        dgData.setRows(list);
        dgData.setTotal(total);
        return  dgData ;
    }
}
