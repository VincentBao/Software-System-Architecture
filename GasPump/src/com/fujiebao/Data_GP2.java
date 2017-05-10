package com.fujiebao;

/**
 * Created by vincent on 4/14/17.
 */
public class Data_GP2 extends Data {
    private int temp_a;
    private int temp_b;
    private int temp_c;
    private int a;
    private int b;
    private int c;
    private int cash;
    private int L;
    private double total;
    private int price;


    //default get and set value
    public int getTemp_a(){
        return temp_a;
    }

    public void setTemp_a(int ta){
        temp_a = ta;
    }

    public int getTemp_b(){
        return temp_b;
    }

    public void setTemp_b(int tb){
        temp_b = tb;
    }

    public int getTemp_c(){
        return temp_c;
    }

    public void setTemp_c(int c){
        temp_c = c;
    }

    public int getA(){
        return a;
    }

    public void setA(int a){
        this.a = a;
    }

    public int getB(){
        return b;
    }

    public void setB(int b){
        this.b = b;
    }

    public int getC(){
        return c;
    }

    public void setC(int c){
        this.c = c;
    }

    public int getCash(){
        return cash;
    }

    public void setCash(int cash){
        this.cash = cash;
    }

    public int getL(){
        return L;
    }

    public void setL(int g){
        L = g;
    }

    public double getTotal(){
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}
