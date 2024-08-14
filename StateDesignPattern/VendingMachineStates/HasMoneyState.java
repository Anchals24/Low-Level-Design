package BehaviouralDesignPatterns.StateDesignPattern.VendingMachineStates;

import BehaviouralDesignPatterns.StateDesignPattern.Coin;
import BehaviouralDesignPatterns.StateDesignPattern.Item;
import BehaviouralDesignPatterns.StateDesignPattern.VendingMachine;

import java.util.List;

public class HasMoneyState implements States{

    public HasMoneyState(){
        System.out.println("Vending Machine is in Has Money State.");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        machine.getCoinList().add(coin);

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());

    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can not choose a product in HasMoney state");

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in HasMoney state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can not dispense a product in HasMoney state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        //understand
        return machine.getCoinList();


    }
}
