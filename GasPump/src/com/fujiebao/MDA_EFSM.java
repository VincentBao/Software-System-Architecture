package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public class MDA_EFSM {
    State s;
    State[] cs;
    int type = 0;
    int ID;

    public MDA_EFSM(){
        cs = new State[8];
        cs[0] = new Start();
        cs[1] = new S0();
        cs[2] = new S1();
        cs[3] = new S2();
        cs[4] = new S3();
        cs[5] = new S4();
        cs[6] = new S5();
        cs[7] = new S6();

        s = cs[0];    //set the initial state to start
        ID = 0;
    }

    public int getType() {
        return type;
    }

    //transfer states
    public void activate(AbstractFactory af){
        ID = s.getid();
        if(ID == 0){
            s.activate(af);
            s = cs[1];
        }
    }

    public void start(AbstractFactory af){
        ID = s.getid();
        if(ID == 1){
            s.start(af);
            s = cs[2];
        }
    }

    public void payType(AbstractFactory af, int t){
        ID = s.getid();
        if(ID == 2){
            if(t == 1){
                s.payType(af, 1);
                s = cs[3];
            }else if(t == 2){
                s.payType(af, 2);
                s = cs[4];
            }
        }
    }

    public void approved(AbstractFactory af){
        ID = s.getid();
        if(ID == 3){
            s.approved(af);
            s = cs[4];
        }
    }

    public void reject(AbstractFactory af){
        ID = s.getid();
        if(ID == 3){
            s.reject(af);
            s = cs[1];
        }
    }

    public void cancel(AbstractFactory af){
        ID = s.getid();
        if(ID == 4){
            s.cancel(af);
            s = cs[1];
        }
    }

    public void selectGas(AbstractFactory af, int g){
        ID = s.getid();
        if(ID == 4){
            s.selectGas(af, g);
            s = cs[5];
        }
    }

    public void startPump(AbstractFactory af){
        ID = s.getid();
        if(ID == 5){
            s.startPump(af);
            s = cs[6];
        }
    }

    public void pump(AbstractFactory af){
        s.pump(af);
    }

    public void stopPump(AbstractFactory af){
        ID = s.getid();
        if(ID == 6){
            s.stopPump(af);
            s = cs[7];
        }
    }

    public void receipt(AbstractFactory af){
        ID = s.getid();
        if(ID == 7){
            s.receipt(af);
            s = cs[1];
        }
    }

    public void noReceipt(AbstractFactory af){
        ID = s.getid();
        if(ID == 7){
            s.noReceipt(af);
            s = cs[1];
        }
    }
}
