package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class SetPrice_GP2 extends SetPrice {

    @Override
    public void setPrice(Data d, int g) {
        int temp_price;
        if(g == 1){
            temp_price = ((Data_GP2) d).getA();
            ((Data_GP2) d).setPrice(temp_price);
        }else if(g == 2){
            temp_price = ((Data_GP2) d).getB();
            ((Data_GP2) d).setPrice(temp_price);
        }else if(g == 3){
            temp_price = ((Data_GP2) d).getC();
            ((Data_GP2) d).setPrice(temp_price);
        }

        System.out.println("Gas type is selected");
        System.out.println(((Data_GP2) d).getPrice());
    }
}
