/*
package com.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class Demo {
    @autowire
    Stock stock;


    public static void main(String[] args) {



    }

    @ReuestMapping(Meththod.Get,/path/)
    public Map<String,Double> avergaeStockPrice(List<Stock> stockList){
        Map<String,Double> map= stockList.stream().collect(Collectors.toMap(stock -> stock.companyName,stock -> stock.pricess.stream().mapToDouble(x -> x.doubleValue()).average().getAsDouble()));
    }
}

class Stock {
    public String companyName;
    List<Double> pricess;
}



*/
