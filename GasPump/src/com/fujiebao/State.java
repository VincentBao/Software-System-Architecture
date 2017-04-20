package com.fujiebao;

/**
 * Created by vincent on 4/3/17.
 */
public abstract class State {
    Op op;
    int id;

    public State(){
        op = new Op();
        id = 0;
    }

    public int getid(){
        return id;
    }

    public void activate(AbstractFactory af){
        
    }

    public void start(AbstractFactory af){

    }

    public void payType(AbstractFactory af, int t){

    }

    public void approved(AbstractFactory af){

    }

    public void reject(AbstractFactory af){

    }

    public void cancel(AbstractFactory af){

    }

    public void selectGas(AbstractFactory af, int g){

    }

    public void startPump(AbstractFactory af){

    }

    public void pump(AbstractFactory af){

    }

    public void stopPump(AbstractFactory af){

    }

    public void receipt(AbstractFactory af){

    }

    public void noReceipt(AbstractFactory af){

    }

}

