package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class PumpGasUnit_GP2 extends PumpGasUnit {

    @Override
    public void pumpGasUnit(Data d){
        int temp_L = ((Data_GP2) d).getL();

        ((Data_GP2) d).setL(temp_L + 1);
        ((Data_GP2) d).setTotal(((Data_GP2) d).getPrice() * ((Data_GP2) d).getL());

        System.out.println("Pump gas unit succeed!");
        System.out.println("The current liter is: " + ((Data_GP2) d).getL() + " L!");
    }
}
