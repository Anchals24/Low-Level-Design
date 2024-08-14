package BehaviouralDesignPatterns.StateDesignPattern.VendingMachineStates;

import BehaviouralDesignPatterns.StateDesignPattern.Coin;
import BehaviouralDesignPatterns.StateDesignPattern.Item;
import BehaviouralDesignPatterns.StateDesignPattern.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements States{

    public IdleState(){
        System.out.println("Currently Vending machine is in Idle State");
    }

    public IdleState(VendingMachine machine){
        System.out.println("Currently Vending machine is in Idle State");
        //query
        machine.setCoinList(new ArrayList<>());

    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception{
        throw new Exception("you can not insert Coin in idle state");

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");

    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception{
        throw new Exception("you can not choose a product in idle state");

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception{
        throw new Exception("you can not get the change in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception{
        throw new Exception("you can not dispense the product in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception{
        throw new Exception("Money can't get refunded in the idle state");
    }

}
