package com.fujiebao;

/**
 * Created by vincent on 4/14/17.
 */
public class AbstractFactory_GP1 extends AbstractFactory {

    public AbstractFactory_GP1(Data data){
        d = data;
    }

    @Override
    public Data getData(){
        return d;
    }

    @Override
    public StoreData createStoreData(){
        return new StoreData_GP1();
    }

    public PayMsg createPayMsg(){
        return new PayMsg_GP1();
    }

    public StoreCash createStoreCash(){
        return new StoreCash_GP();
    }

    public DisplayMenu createDisplayMenu(){
        return new DisplayMenu_GP1();
    }

    public RejectMsg createRejectMsg(){
        return new RejectMsg_GP();
    }

    public SetPrice createSetPrice(){
        return new SetPrice_GP1();
    }

    public ReadyMsg createReadyMsg(){
        return new ReadyMsg_GP();
    }

    public SetInitialValue createSetInitialValue(){
        return new SetInitialValue_GP1();
    }

    public PumpGasUnit createPumpGasUnit(){
        return new PumpGasUnit_GP1();
    }

    public GasPumpMsg createGasPumpMsg(){
        return new GasPumpMsg_GP1();
    }

    public StopMsg createStopMsg(){
        return new StopMsg_GP1();
    }

    public PrintReceipt createPrintReceipt(){
        return new PrintReceipt_GP1();
    }

    public CancelMsg createCancelMsg(){
        return new CancelMsg_GP();
    }

    public ReturnCash createReturnCash(){
        return new ReturnCash_GP();
    }
}
