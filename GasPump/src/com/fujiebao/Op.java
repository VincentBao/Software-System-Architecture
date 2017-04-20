package com.fujiebao;

/**
 * Created by vincent on 4/9/17.
 */
public class Op {

    public void storeData(AbstractFactory af){
        Data data = af.getData();
        StoreData sd = af.createStoreData();
        sd.storeData(data);
    }

    public void payMsg(AbstractFactory af){
        PayMsg pm = af.createPayMsg();
        pm.displayPayMsg();
    }

    public void storeCash(AbstractFactory af){
        Data data = af.getData();
        StoreCash sc = af.createStoreCash();
        sc.storeCash(data);
    }

    public void displayMenu(AbstractFactory af){
        DisplayMenu dm = af.createDisplayMenu();
        dm.displayMenu();
    }

    public void rejectMsg(AbstractFactory af){
        RejectMsg rm = af.createRejectMsg();
        rm.displayRejectMsg();
    }

    public void setPrice(AbstractFactory af, int g){
        Data data = af.getData();
        SetPrice sp = af.createSetPrice();
        sp.setPrice(data, g);
    }

    public void readyMsg(AbstractFactory af){
        ReadyMsg rm = af.createReadyMsg();
        rm.displayReadyMsg();
    }

    public void setInitialValue(AbstractFactory af){
        Data data = af.getData();
        SetInitialValue iv = af.createSetInitialValue();
        iv.setValue(data);
    }

    public void pumpGasUnit(AbstractFactory af){
        Data data = af.getData();
        PumpGasUnit gu = af.createPumpGasUnit();
        gu.pumpGasUnit(data);
    }

    public void gasPumpMsg(AbstractFactory af){
        GasPumpMsg pm = af.createGasPumpMsg();
        pm.displayPumpMsg();
    }

    public void stopMsg(AbstractFactory af){
        StopMsg sm = af.createStopMsg();
        sm.displayStopMsg();
    }

    public void printReceipt(AbstractFactory af){
        Data data = af.getData();
        PrintReceipt pr = af.createPrintReceipt();
        pr.displayReceipt(data);
    }

    public void cancelMsg(AbstractFactory af){
        CancelMsg cm = af.createCancelMsg();
        cm.displayCancel();
    }

    public void returnCash(AbstractFactory af){
        Data data = af.getData();
        ReturnCash rc = af.createReturnCash();
        rc.returnCash(data);
    }
}
