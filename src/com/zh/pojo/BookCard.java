package com.zh.pojo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 跟数据库表一致，作为一个java对象
 * 1个对象代表的是数据库表中的一行记录
 * 1个属性代表的是表中的一个字段
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
    
    //定义get()、set()方法
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