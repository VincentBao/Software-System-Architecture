package com.fujiebao;

/**
 * Created by vincent on 4/14/17.
 */

import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        Test test = new Test();
        System.out.println("Gas Pump System!");
        System.out.println("Select the gas pump: \n1.Gaspump_1 \n2.Gaspump_2");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 1){
            test.menuGasPump1();
            while(true){
                GasPump_1 gp1 = new GasPump_1();
                test.operationGasPump1(gp1);
            }
        }else if(num == 2){
            test.menuGasPump2();
            while(true){
                GasPump_2 gp2 = new GasPump_2();
                test.operationGasPump1(gp2);
            }
        }



    }

    public void menuGasPump1(){
        System.out.println("GasPump-1\n" +
                "Menu of Operations\n" +
                "0. Activate(float , float )\n" +
                "1. Start()\n" +
                "2. PayCredit()\n" +
                "3. Reject()\n" +
                "4. Cancel()\n" +
                "5. Approved()\n" +
                "6. Super()\n" +
                "7. Regular()\n" +
                "8. StartPump()\n" +
                "9. PumpGallon()\n" +
                "a. StopPump()\n" +
                "q. Quit\n\n");
    }

    public void displayGasPump1(){
        System.out.println("Select Operation: ");
        System.out.println("0-Activate, 1-Start, 2-PayCredit, 3-Reject, 4-Cancel, 5-Approved\n" +
                "6-Super, 7-Regular, 8-StartPump, 9-PumpGallon, a-StopPump, q-Quit\n\n");
    }

    public void operationGasPump1(GasPump_1 gp1){
        Scanner sc = new Scanner(System.in);
        Test test1 = new Test();
        while (true) {
            String n = sc.next();
            test1.displayGasPump1();
            switch(n){
                case "0":
                    System.out.println("Please input a float price of Regular gas:");
                    float a = sc.nextFloat();
                    System.out.println("Please input a float price of Super gas:");
                    float b = sc.nextFloat();
                    gp1.activate(a,b);
                    break;
                case "1":
                    System.out.println("Start the transaction:");
                    gp1.start();
                    break;
                case "2":
                    System.out.println("Pay for gas by a credit card:");
                    gp1.payCredit();
                    break;
                case "3":
                    System.out.println("Credit card is rejected:");
                    gp1.reject();
                    break;
                case "4":
                    System.out.println("Cancel the transaction:");
                    gp1.cancel();
                    break;
                case "5":
                    System.out.println("Credit card is approved:");
                    gp1.approved();
                    break;
                case "6":
                    System.out.println("Super gas is selected:");
                    gp1.Super();
                    break;
                case "7":
                    System.out.println("Regular gas is selected:");
                    gp1.regular();
                    break;
                case "8":
                    System.out.println("Start pumping gas:");
                    gp1.startPump();
                    break;
                case "9":
                    System.out.println("One gallon of gas is disposed:");
                    gp1.pumpGallon();
                    break;
                case "a":
                    System.out.println("Stop pumping gas:");
                    gp1.stopPump();
                    break;
                case "q":
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select the correct operations!");
                    break;
            }
        }

    }


    public void menuGasPump2(){
        System.out.println("GasPump-2\n" +
                "0. Activate(int, int, int)\n" +
                "1. Start()\n" +
                "2. PayCash(int)\n" +
                "3. Cancel()\n" +
                "4. Premium()\n" +
                "5. Regular()\n" +
                "6. Super()\n" +
                "7. StartPump()\n" +
                "8. PumpLiter()\n" +
                "9. Stop()\n" +
                "a. Receipt()\n" +
                "b. NoReceipt()\n" +
                "q. Quit\n\n");
    }

    public void displayGasPump2(){
        System.out.println("Select Operation: ");
        System.out.println("0-Activate, 1-Start, 2-PayCash, 3-Cancel, 4-Premium, 5-Regular, 6-Super\n" +
                "7-StartPump, 8-PumpLiter, 9-Stop, a-Receipt, b-NoReceipt, q-Quit\n\n");
    }

    public void operationGasPump1(GasPump_2 gp2){
        Scanner sc = new Scanner(System.in);
        Test test2 = new Test();
        while (true) {
            String n = sc.next();
            test2.displayGasPump2();
            switch(n){
                case "0":
                    System.out.println("Please input an int price of Regular gas:");
                    int a = sc.nextInt();
                    System.out.println("Please input an int price of Premium gas:");
                    int b = sc.nextInt();
                    System.out.println("Please input an int price of Super gas");
                    int c = sc.nextInt();
                    gp2.activate(a, b, c);
                    break;
                case "1":
                    System.out.println("Start the transaction:");
                    gp2.start();
                    break;
                case "2":
                    System.out.println("Pay for gas by cash:");
                    System.out.println("Input your cash:");
                    int cash = sc.nextInt();
                    gp2.payCash(cash);
                    break;
                case "3":
                    System.out.println("Cancel the transaction:");
                    gp2.cancel();
                    break;
                case "4":
                    System.out.println("Premium gas is selected:");
                    gp2.premium();
                    break;
                case "5":
                    System.out.println("Regular gas is selected:");
                    gp2.regular();
                    break;
                case "6":
                    System.out.println("Super gas is selected:");
                    gp2.Super();
                    break;
                case "7":
                    System.out.println("Start pumping gas:");
                    gp2.startPump();
                    break;
                case "8":
                    System.out.println("One liter of gas is disposed:");
                    gp2.pumpLiter();
                    break;
                case "9":
                    System.out.println("Stop pumping gas:");
                    gp2.stop();
                    break;
                case "a":
                    System.out.println("Receipt is requested:");
                    gp2.receipt();
                    break;
                case "b":
                    System.out.println("No receipt:");
                    gp2.noReceipt();
                    break;
                case "q":
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select the correct operations!");
                    break;
            }
        }

    }



}
