package com.zh.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zh.dao.IndexDao;
import com.zh.pojo.BookCard;

//创建IndexDaoImpl(实现类)实现IndexDao接口
@Repository("indexDaoImpl")
public class IndexDaoImpl implements IndexDao {
    
    //在SSH的设计理念：要使用某个实例，那么就定义声明一个对象，然后
    //给它添加set方法（用于spring注入进来）
    //实现不要关注这个实例来自于那里，以及怎么创建，或者它是谁    
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
        
        //sessionFactory这个实例可以自己按常规的hibernate传统写法创建
        //也可以交给spring去托管
        /*
        Configuration cfg = new Configuration().configure();
        sessionFactory = cfg.buildSessionFactory();*/
        
        //获取session
        //Session session = sessionFactory.getCurrentSession();
            
        //后面当使用JPA的时候，EntityManager 类似于 Session
        //Query query = session.createQuery("from BookCard");
    	
    	
        
        //将所有的数据查询出来并放到List集合里
        //List<BookCard> list = (List<BookCard>)query.list();
    	
    	List<BookCard> list = sessionFactory.getCurrentSession().createQuery("from BookCard").list();
    	//int cid = 1;
    	//BookCard bookCard = (BookCard) sessionFactory.getCurrentSession().get(BookCard.class, cid);
        
        //将集合遍历循环
        //for(BookCard bookCard:list){
            //打印输出到控制台
            //System.out.println(bookCard);
        //}
        
        //关闭session
        //session.close();
        //关闭sessionFactory
        //sessionFactory.close();
        //返回list集合
        return list;
        
    }

}