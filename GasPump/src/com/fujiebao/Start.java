package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public class Start extends State{

    @Override
    public int getid(){
        id = 0;
        return id;
    }

    @Override
    public void activate(AbstractFactory af){
        op.storeData(af);
    }
}
