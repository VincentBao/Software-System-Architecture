package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class PrintReceipt_GP1 extends PrintReceipt {

    @Override
    public void displayReceipt(Data d){
        double total = ((Data_GP1) d).getTotal();

        System.out.println("Total price is: " + total + "$ !");
    }
}
