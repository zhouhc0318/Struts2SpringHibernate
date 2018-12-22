package com.zh.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zh.dao.IndexDao;
import com.zh.pojo.BookCard;

//����IndexDaoImpl(ʵ����)ʵ��IndexDao�ӿ�
@Repository("indexDaoImpl")
public class IndexDaoImpl implements IndexDao {
    
    //��SSH��������Ҫʹ��ĳ��ʵ������ô�Ͷ�������һ������Ȼ��
    //�������set����������springע�������
    //ʵ�ֲ�Ҫ��ע���ʵ������������Լ���ô��������������˭    
//    private SessionFactory sessionFactory;
//    
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
	
	@Autowired
	@Resource(name="sessionFactory")
	SessionFactory sessionFactory;
	
	@Transactional
    @SuppressWarnings("unchecked")
	@Override
    public List<BookCard> getAllBookCard() {
        
        //sessionFactory���ʵ�������Լ��������hibernate��ͳд������
        //Ҳ���Խ���springȥ�й�
        /*
        Configuration cfg = new Configuration().configure();
        sessionFactory = cfg.buildSessionFactory();*/
        
        //��ȡsession
        //Session session = sessionFactory.getCurrentSession();
            
        //���浱ʹ��JPA��ʱ��EntityManager ������ Session
        //Query query = session.createQuery("from BookCard");
    	
    	
        
        //�����е����ݲ�ѯ�������ŵ�List������
        //List<BookCard> list = (List<BookCard>)query.list();
    	
    	List<BookCard> list = sessionFactory.getCurrentSession().createQuery("from BookCard").list();
    	//int cid = 1;
    	//BookCard bookCard = (BookCard) sessionFactory.getCurrentSession().get(BookCard.class, cid);
        
        //�����ϱ���ѭ��
        //for(BookCard bookCard:list){
            //��ӡ���������̨
            //System.out.println(bookCard);
        //}
        
        //�ر�session
        //session.close();
        //�ر�sessionFactory
        //sessionFactory.close();
        //����list����
        return list;
        
    }

}