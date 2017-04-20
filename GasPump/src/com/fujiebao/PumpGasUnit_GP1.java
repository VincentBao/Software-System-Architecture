package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class PumpGasUnit_GP1 extends PumpGasUnit {

    @Override
    public void pumpGasUnit(Data d){
        int temp_g = ((Data_GP1) d).getG();

        ((Data_GP1) d).setG(temp_g + 1);
        ((Data_GP1) d).setTotal(((Data_GP1) d).getPrice() * ((Data_GP1) d).getG());

        System.out.println("Pump gas unit succeed!");
        System.out.println("The current gallon is: " + ((Data_GP1) d).getG() + " G!");
    }
}
