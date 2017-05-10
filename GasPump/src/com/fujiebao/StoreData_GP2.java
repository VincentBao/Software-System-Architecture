package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class StoreData_GP2 extends StoreData {

    @Override
    public void storeData(Data d){
        int temp_a = ((Data_GP2) d).getTemp_a();
        int temp_b = ((Data_GP2) d).getTemp_b();
        int temp_c = ((Data_GP2) d).getTemp_c();

        ((Data_GP2) d).setA(temp_a);
        ((Data_GP2) d).setB(temp_b);
        ((Data_GP2) d).setC(temp_c);

        System.out.println("Gas Pump Activated");
//        System.out.println("the price of regular gas is " + ((Data_GP2) d).getA());
//        System.out.println("the price of premium gas is " + ((Data_GP2) d).getB());
//        System.out.println("the price of super gas is " + ((Data_GP2) d).getC());
    }
}
