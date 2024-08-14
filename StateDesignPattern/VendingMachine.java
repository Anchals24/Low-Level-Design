package BehaviouralDesignPatterns.StateDesignPattern;

import BehaviouralDesignPatterns.StateDesignPattern.VendingMachineStates.IdleState;
import BehaviouralDesignPatterns.StateDesignPattern.VendingMachineStates.States;


import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private States vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public States getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(States vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}

