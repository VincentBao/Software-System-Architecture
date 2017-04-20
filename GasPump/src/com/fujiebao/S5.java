package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public class S5 extends State {

    @Override
    public int getid(){
        id = 6;
        return id;
    }

    @Override
    public void pump(AbstractFactory af){
        op.pumpGasUnit(af);
        op.gasPumpMsg(af);
    }

    @Override
    public void stopPump(AbstractFactory af){
        op.stopMsg(af);
    }
}
