package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public abstract class AbstractFactory {  //abstract class
    Data d;

    //abstract method
    public abstract Data getData();

    public abstract StoreData createStoreData();

    public abstract PayMsg createPayMsg();

    public abstract StoreCash createStoreCash();

    public abstract DisplayMenu createDisplayMenu();

    public abstract RejectMsg createRejectMsg();

    public abstract SetPrice createSetPrice();

    public abstract ReadyMsg createReadyMsg();

    public abstract SetInitialValue createSetInitialValue();

    public abstract PumpGasUnit createPumpGasUnit();

    public abstract GasPumpMsg createGasPumpMsg();

    public abstract StopMsg createStopMsg();

    public abstract PrintReceipt createPrintReceipt();

    public abstract CancelMsg createCancelMsg();

    public abstract ReturnCash createReturnCash();
}
