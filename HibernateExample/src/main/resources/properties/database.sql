
create table stock(STOCK_ID int(10) unsigned NOT NULL AUTO_INCREMENT, STOCK_CODE varchar(10) NOT NULL, STOCK_NAME varchar(20) NOT NULL, PRIMARY KEY (STOCK_ID) USING BTREE, UNIQUE KEY UNI_STOCK_NAME (STOCK_NAME),UNIQUE KEY UNI_STOCK_ID (STOCK_CODE) USING BTREE) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
