package com.zh.pojo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * �����ݿ��һ�£���Ϊһ��java����
 * 1���������������ݿ���е�һ�м�¼
 * 1�����Դ�����Ǳ��е�һ���ֶ�
 */
@Entity
@Table(name = "bookCard")
public class BookCard {
    @Id
    @Column(name="cid")
    private int cid  ;
    @Column(name="name")
    private String name;
    @Column(name="sex")
    private String sex ;
    @Column(name="cardDate")
    private Date cardDate;
    @Column(name="deposit")
    private BigDecimal deposit;
    
    //����get()��set()����
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Date getCardDate() {
        return cardDate;
    }
    public void setCardDate(Date cardDate) {
        this.cardDate = cardDate;
    }
    public BigDecimal getDeposit() {
        return deposit;
    }
    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

}