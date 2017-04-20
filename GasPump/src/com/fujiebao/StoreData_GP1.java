package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class StoreData_GP1 extends StoreData {

    @Override
    public void storeData(Data d){
        double temp_a = ((Data_GP1) d).getTemp_a();
        double temp_b = ((Data_GP1) d).getTemp_b();

        ((Data_GP1) d).setA(temp_a);
        ((Data_GP1) d).setB(temp_b);

        System.out.println("Gas Pump Activated");
        System.out.println("the price of regular gas is " + ((Data_GP1) d).getA());
        System.out.println("the price of regular gas is " + ((Data_GP1) d).getB());
    }
}
