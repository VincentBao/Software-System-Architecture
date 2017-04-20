package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class SetPrice_GP1 extends SetPrice {

    @Override
    public void setPrice(Data d, int g){
        double temp_price;
        if(g == 1) {
            temp_price = ((Data_GP1) d).getA();
            ((Data_GP1) d).setPrice(temp_price);
        }else if(g == 3){
            temp_price = ((Data_GP1) d).getB();
            ((Data_GP1) d).setPrice(temp_price);
        }

        System.out.println("Gas type is selected!");
        System.out.println("the price of current gas is " + ((Data_GP1) d).getPrice() + "$ !");
    }
}
