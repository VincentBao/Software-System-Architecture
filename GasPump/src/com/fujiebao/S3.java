package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public class S3 extends State {

    @Override
    public int getid(){
        id = 4;
        return id;
    }

    @Override
    public void selectGas(AbstractFactory af, int g){
        op.setPrice(af, g);
    }

    @Override
    public void cancel(AbstractFactory af){
        op.cancelMsg(af);
        op.returnCash(af);
    }
}
