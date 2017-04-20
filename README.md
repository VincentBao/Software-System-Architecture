# Software-System-Architecture

Goal:
The goal of this project is to design two different GasPump components using the Model-Driven
Architecture (MDA) and then implement these GasPump components based on this design.
Description of the Project:
There are two GasPump components: GasPump-1 and GasPump-2.
The GasPump-1 component supports the following operations:
Activate (float a, float b) // the gas pump is activated where a is the price of the Regular gas and b is the price of Super gas per gallon

Start()                     //start the transaction
PayCredit()                 // pay for gas by a credit card
Reject()                    // credit card is rejected
Cancel()                    // cancel the transaction
Approved()                  // credit card is approved
Super()                     // Super gas is selected
Regular()                   // Regular gas is selected
StartPump()                 // start pumping gas
PumpGallon()                // one gallon of gas is disposed
StopPump()                  // stop pumping gas

The GasPump-2 component supports the following operations:
Activate (int a, int b, int c) // the gas pump is activated where a is the price of Regular gas, b is the price of Premium gas and c is the price of Super gas per liter

Start()                        //start the transaction
PayCash(int c)          // pay for gas by cash, where c represents prepaid cash
Cancel()                     // cancel the transaction
Premium()                // Premium gas is selected
Regular()                   // Regular gas is selected
Super()                      // Super gas is selected
StartPump()              // start pumping gas
PumpLiter()              // one liter of gas is disposed
Stop                           // stop pumping gas
Receipt()                    // Receipt is requested
NoReceipt()               // No receipt

The goal of the second part of the project is to design two GasPump components using the Model-Driven Architecture (MDA) and then implement these GasPump components based on this design using the OO programming language. This OO-oriented design should be based on the MDA-EFSM for both
GasPump components that was identified in the first part of the project. In your design, you MUST use the following OO design patterns:
1. state pattern

2. strategy pattern

3. abstract factory pattern  

   In the design, you need to provide the class diagram, in which the coupling between components should be minimized and the cohesion of components should be maximized (components with high cohesion and low coupling between components). In addition, two sequence diagrams should be provided as described on the next page. After the design is completed, you need to implement the GasPump components based on your design using the OO programming language. In addition, the driver for the project to execute and test the correctness of the design and its implementation for the GasPump components must be implemented.