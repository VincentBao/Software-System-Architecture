package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class SetInitialValue_GP1 extends SetInitialValue {

    @Override
    public void setValue(Data d){
        ((Data_GP1) d).setG(0);
        ((Data_GP1) d).setTotal(0);
    }
}
