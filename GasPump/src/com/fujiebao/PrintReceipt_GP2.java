package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class PrintReceipt_GP2 extends PrintReceipt {

    @Override
    public void displayReceipt(Data d){
        int l = ((Data_GP2) d).getL();
        int cash = ((Data_GP2) d).getCash();
        double total = l * ((Data_GP2) d).getPrice();
        double r_cash = (double)cash - total;

        System.out.println("Total liter is: " + l + "L!");
        System.out.println("Total price is: " + total + "$ !");
        System.out.println("Return cash is: " + r_cash + "$ !");
    }
}
