package com.zh.dao;

import java.util.List;

import com.zh.pojo.BookCard;


//创建IndexDao(接口类)
public interface IndexDao {
    
    public List<BookCard> getAllBookCard();
    
}
