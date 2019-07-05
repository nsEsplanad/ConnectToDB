package com.mkyong.stock.dao.Impl;

import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.Stock;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class StockDaoImpl extends HibernateDaoSupport implements StockDao {
    @Override
    public void save(Stock stock) {
        getHibernateTemplate().save(stock);
    }

    @Override
    public void update(Stock stock) {
        getHibernateTemplate().update(stock);
    }

    @Override
    public void delete(Stock stock) {
        getHibernateTemplate().delete(stock);
    }

    @Override
    public Stock findByStockCode(Stock stockCode) {
        List list=getHibernateTemplate().find("from stock where stockCode=?", stockCode);

        return (Stock) list.get(0);
    }
}
