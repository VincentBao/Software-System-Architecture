package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public class GasPump_2 {
    MDA_EFSM m;
    Data d;
    AbstractFactory af;

    public GasPump_2(){
        m = new MDA_EFSM();
        d = new Data_GP2();
        af = new AbstractFactory_GP2(d);
    }

    public void activate(int a, int b, int c){
        if((a > 0) && (b > 0) && (c > 0)){
            ((Data_GP2)d).setTemp_a(a);  //store int a into Data_GP2 as temp_a
            ((Data_GP2)d).setTemp_b(b);  //store int b into Data_GP2 as temp_b
            ((Data_GP2)d).setTemp_c(c);  //store int c into Data_GP2 as temp_c

            m.activate(af);
        }

    }

    public void start(){
        m.start(af);
    }

    public void payCash(int c){
        ((Data_GP2) d).setCash(c);  //store int cash c into Data_GP2 as cash
        m.payType(af, 2);
    }

    public void cancel(){
        m.cancel(af);
    }

    public void premium(){
        m.selectGas(af, 2);
    }

    public void regular(){
        m.selectGas(af, 1);
    }

    public void Super(){
        m.selectGas(af, 3);
    }

    public void startPump(){
        m.startPump(af);
    }

    public void pumpLiter(){
        //cash should more than the total price
        if(((Data_GP2)d).getCash() < (((Data_GP2)d).getL()+1) * ((Data_GP2)d).getPrice()){
            m.stopPump(af);
        }else{
            m.pump(af);
        }
    }

    public void stop(){
        m.stopPump(af);
    }

    public void receipt(){
        m.receipt(af);
    }

    public void noReceipt(){
        m.noReceipt(af);
    }
}
