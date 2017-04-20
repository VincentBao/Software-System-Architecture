package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class StoreCash_GP extends StoreCash {

    @Override
    public void storeCash(Data d){
        int temp_cash = ((Data_GP2) d).getCash();

        ((Data_GP2) d).setCash(temp_cash);

        System.out.println("Paycash Succeed!");
    }
}
