package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public class S0 extends State {

    @Override
    public int getid(){
        id = 1;
        return id;
    }

    @Override
    public void start(AbstractFactory af){
        op.payMsg(af);
    }
}
