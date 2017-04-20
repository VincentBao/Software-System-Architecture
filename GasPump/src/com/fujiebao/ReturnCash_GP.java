package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class ReturnCash_GP extends ReturnCash {

    @Override
    public void returnCash(Data d){
        double cash = ((Data_GP2) d).getCash();
        double total = ((Data_GP2) d).getTotal();
        double r_cash = cash - total;

        System.out.println("Return cash is: " + r_cash + "$ !");
    }
}
