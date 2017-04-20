package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public class S1 extends State {

    @Override
    public int getid(){
        id = 2;
        return id;
    }

    @Override
    public void payType(AbstractFactory af, int t){
        if(t == 2){
            op.storeCash(af);
            op.displayMenu(af);
        }
    }
}
