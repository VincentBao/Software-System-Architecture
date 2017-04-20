package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public class S6 extends State {

    @Override
    public int getid(){
        id = 7;
        return id;
    }

    @Override
    public void receipt(AbstractFactory af){
        op.printReceipt(af);
        //op.returnCash(af);
    }

    @Override
    public void noReceipt(AbstractFactory af){
        op.returnCash(af);
    }
}
