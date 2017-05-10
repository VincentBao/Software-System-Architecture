package com.fujiebao;

/**
 * Created by vincent on 4/14/17.
 */
public class Data_GP1 extends Data {
    private double temp_a;
    private double temp_b;
    private double a;
    private double b;
    private int G;
    private double total;
    private double price;

    //defaule get and set value
    public double getTemp_a(){
        return temp_a;
    }

    public void setTemp_a(double ta){
        temp_a = ta;
    }

    public double getTemp_b(){
        return temp_b;
    }

    public void setTemp_b(double tb){
        temp_b = tb;
    }

    public double getA(){
        return a;
    }

    public void setA(double a){
        this.a = a;
    }

    public double getB(){
        return b;
    }

    public void setB(double b){
        this.b = b;
    }

    public int getG(){
        return G;
    }

    public void setG(int g){
        G = g;
    }

    public double getTotal(){
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
