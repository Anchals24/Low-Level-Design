package BehaviouralDesignPatterns.StateDesignPattern.VendingMachineStates;


import BehaviouralDesignPatterns.StateDesignPattern.Coin;
import BehaviouralDesignPatterns.StateDesignPattern.Item;
import BehaviouralDesignPatterns.StateDesignPattern.VendingMachine;

import java.util.List;

public class SelectionState implements States    {

    public SelectionState(){
        System.out.println("Currently Vending Machine is in Selection State");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");

    }

    @Override
    public void insertCoin(VendingMachine machine , Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;

    }


    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        //1. get item associated with this code number
        Item item = machine.getInventory().getItem(codeNumber);

        //2. total amount paid by User
        int paidByUser = 0;
        for(Coin coin : machine.getCoinList()){
            paidByUser = paidByUser + coin.value;
        }

        //3. compare product price and amount paid by user
        if(paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
            refundFullMoney(machine);
            throw new Exception("insufficient amount");
        }
        else if(paidByUser >= item.getPrice()) {

            if(paidByUser > item.getPrice()) {
                getChange(paidByUser - item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        //actual logic should be to return COINs in the dispense tray, but for simplicity i am just returning the amount to be refunded
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnChangeMoney);
        return returnChangeMoney;

    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed Selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();

    }
}
