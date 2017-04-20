package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public class S2 extends State {

    @Override
    public int getid(){
        id = 3;
        return id;
    }

    @Override
    public void approved(AbstractFactory af){
        op.displayMenu(af);
    }

    @Override
    public  void reject(AbstractFactory af){
        op.rejectMsg(af);
    }
}
