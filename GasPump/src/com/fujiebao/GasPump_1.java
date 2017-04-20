package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public class GasPump_1 {
    MDA_EFSM m;
    Data d;
    AbstractFactory af;

    public GasPump_1(){
        m = new MDA_EFSM();
        d = new Data_GP1();
        af = new AbstractFactory_GP1(d);
    }

    public void activate(float a, float b){
        if((a > 0) && (b > 0)) {
            ((Data_GP1)d).setTemp_a(a);
            ((Data_GP1)d).setTemp_b(b);

            m.activate(af);
        }
    }

    public void start(){
        m.start(af);
    }

    public void payCredit(){
        m.payType(af, 1);
    }

    public void reject(){
        m.reject(af);
    }

    public void cancel(){
        m.cancel(af);
    }

    public void approved(){
        m.approved(af);
    }

    public void Super(){
        m.selectGas(af, 3);
    }

    public void regular(){
        m.selectGas(af, 1);
    }

    public void startPump(){
        m.startPump(af);
    }

    public void pumpGallon(){
        m.pump(af);
    }

    public void stopPump(){
        m.stopPump(af);
        m.receipt(af);
    }
}
