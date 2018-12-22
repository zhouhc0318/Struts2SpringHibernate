package com.zh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zh.dao.IndexDao;
import com.zh.pojo.BookCard;
import com.zh.service.IndexService;


//����IndexServiceImpl(ʵ����)ʵ��IndexService�ӿ�
@Service("indexServiceImpl")
public class IndexServiceImpl implements IndexService {

    //daoʵ��ʹ��ע�뷽ʽ
	@Autowired 
	@Resource(name="indexDaoImpl")
    private IndexDao indexDao;
    //private IndexDao id;
    //����ע��ʹ��
    //public void setId(IndexDao id) {
        //this.id = id;
    //}


    @Override
    public List<BookCard> getAllBookCard() {
        //����Ӧ�ñ�дҵ���߼��Ĵ��룬
        //������û��ҵ���߼����Ͳ���д��
        
        //�������ݿ�Ĵ��룬���������service��һ��
        //����dao���������ݿ�
        List<BookCard> myBookCardList = indexDao.getAllBookCard();
        
        //����������ҵ���߼��������������Ӷ�һ��ѡ��Ƿ����
        //��������Ҫ
        //....
        
        return myBookCardList;
    }

}
