package com.mkyong.stock.bo.Impl;

import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.Stock;

public class StockBoImpl implements StockBo {

    private StockDao stockDao;

    @Override
    public void save(Stock stock) {
        stockDao.save(stock);
    }

    @Override
    public void update(Stock stock) {
        stockDao.update(stock);
    }

    @Override
    public void delete(Stock stock) {
        stockDao.delete(stock);
    }

    @Override
    public Stock findByStockCode(Stock stockCode) {

        return stockDao.findByStockCode(stockCode);
    }
}
