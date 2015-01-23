package model;

import java.io.Serializable;

/**
 * 书籍
 * Created by lyp on 2015/1/16 0016.
 */
public class Book implements Serializable{
    private int bid;
    private String name;            //书名
    private String author;          //作者
    private String c_num;           //分类号
    private String publishName;     //出版单位
    private int publishTime;        //出版时间
    private double price;            //价格

    public Book(){

    }

    public Book(int bid, String name, String author, String c_num, String publishName, int publishTime, double price) {
        this.bid = bid;
        this.name = name;
        this.author = author;
        this.c_num = c_num;
        this.publishName = publishName;
        this.publishTime = publishTime;
        this.price = price;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getC_num() {
        return c_num;
    }

    public void setC_num(String c_num) {
        this.c_num = c_num;
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public int getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(int publishTime) {
        this.publishTime = publishTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
