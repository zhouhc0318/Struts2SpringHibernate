package com.zh.action;

import java.text.DecimalFormat;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zh.pojo.BookCard;
import com.zh.service.IndexService;


//����IndexAction(action��)�̳�ActionSupport�ӿ�
@Component("indexAction")
public class IndexAction extends ActionSupport {
    
    private static final long serialVersionUID = 1L;
    
    //����service�������������������ʵ�����ʵ����
	@Autowired 
	@Resource(name="indexServiceImpl")
    private IndexService indexService;
    //private IndexService is = null;
    //���set()����
    //public void setIs(IndexService is) {
        //this.is = is;
    //}
    
    //��дexecute()����
    public String execute() {
        
        //��ȡIndexServiceʵ��������getAllBookCard()����
        //��������浽List������
        List<BookCard> myBookCardList = indexService.getAllBookCard();
        
        //����ѯ�����Ľṹ����ӡ������̨
        System.out.println("�������"+myBookCardList.size());
        
        //��ȡContext�����Ķ���
        ActionContext ac = ActionContext.getContext();
        //��myBookCardList������ӵ������Ķ�����
        ac.put("myBookCardList", myBookCardList);
        
        //����һ���ַ���
        return "success";
    }
    
    //����ʽת��
    public String formatDouble(double s){
        DecimalFormat fmat=new DecimalFormat("\u00A4##.0"); 
        return fmat.format(s);
    }
    
}