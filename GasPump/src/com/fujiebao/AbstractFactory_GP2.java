package com.fujiebao;

/**
 * Created by vincent on 4/14/17.
 */
public class AbstractFactory_GP2 extends AbstractFactory{

    public AbstractFactory_GP2(Data data){
        d = data;
    }

    public Data getData(){
        return d;
    }

    public StoreData createStoreData(){
        return new StoreData_GP2();
    }

    public PayMsg createPayMsg(){
        return new PayMsg_GP2();
    }

    public StoreCash createStoreCash(){
        return new StoreCash_GP();
    }

    public DisplayMenu createDisplayMenu(){
        return new DisplayMenu_GP2();
    }

    public RejectMsg createRejectMsg(){
        return new RejectMsg_GP();
    }

    public SetPrice createSetPrice(){
        return new SetPrice_GP2();
    }

    public ReadyMsg createReadyMsg(){
        return new ReadyMsg_GP();
    }

    public SetInitialValue createSetInitialValue(){
        return new SetInitialValue_GP2();
    }

    public PumpGasUnit createPumpGasUnit(){
        return new PumpGasUnit_GP2();
    }

    public GasPumpMsg createGasPumpMsg(){
        return new GasPumpMsg_GP2();
    }

    public StopMsg createStopMsg(){
        return new StopMsg_GP2();
    }

    public PrintReceipt createPrintReceipt(){
        return new PrintReceipt_GP2();
    }

    public CancelMsg createCancelMsg(){
        return new CancelMsg_GP();
    }

    public ReturnCash createReturnCash(){
        return new ReturnCash_GP();
    }
}
