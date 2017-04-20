package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class SetInitialValue_GP2 extends SetInitialValue {

    @Override
    public void setValue(Data d){
        ((Data_GP2) d).setL(0);
        ((Data_GP2) d).setTotal(0);
    }
}
