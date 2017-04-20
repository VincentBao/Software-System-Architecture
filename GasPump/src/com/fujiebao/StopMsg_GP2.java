package com.fujiebao;

/**
 * Created by vincent on 4/17/17.
 */
public class StopMsg_GP2 extends StopMsg {

    @Override
    public void displayStopMsg(){
        System.out.println("Stop pump!");
        System.out.println("Do you want to print receipt?");
    }
}
