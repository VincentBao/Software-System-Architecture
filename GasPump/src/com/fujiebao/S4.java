package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public class S4 extends State {

    @Override
    public int getid(){
        id = 5;
        return id;
    }

    @Override
    public void startPump(AbstractFactory af) {
        op.setInitialValue(af);
        op.readyMsg(af);
    }
}
