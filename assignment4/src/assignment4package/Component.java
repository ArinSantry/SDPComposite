/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4package;

import java.util.Random;

/**
 *
 * @author erins
 */
public class Component extends Parts {

    String partName;
    String partNumber;
    int partCost;
    
    public Component(String partName)
    {
        this.partName = partName;
    }
    
    @Override
    public String getPartNumber() {
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        partNumber = "" + number;
        return partNumber;
    }

    @Override
    public int getPartCost() {
        Random random = new Random();
        partCost = random.nextInt(900) + 100;
        return partCost;
    }

    @Override
    public void showInfo() {
        
        System.out.println("Component name: " + partName);
        System.out.println("Part number: " + getPartNumber());
        System.out.println("Cost: $" + getPartCost());
    }

    @Override
    public void addComponent(Parts component) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
