/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4package;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author erins
 */
public class PrimaryPart extends Parts {
    private String carName;
    private String partName;
    private String partNumber;
    private int partCost;
    private List<Parts> componentParts;
    
    public PrimaryPart(String carName, String partName)
    {
        this.carName = carName;
        this.partName = partName;
        this.componentParts = new ArrayList();
    }
    
    @Override
    public void addComponent(Parts part)
    {
        componentParts.add(part);
    }
    
    public List<Parts>componentParts()
    {
        return componentParts;
    }
    
    @Override
    public String getPartNumber()
    {
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        partNumber = "" + number;
        return partNumber;
    }
    
    @Override
    public int getPartCost()
    {
        Random random = new Random();
        partCost = random.nextInt(900) + 100;
        return partCost;
    }
    
    @Override
    public void showInfo()
    {
        System.out.println("Car type: " + carName);
        System.out.println("Primary part: " + partName);
        for (Parts part : componentParts)
        {
            part.showInfo();
        }
        System.out.println();
    }
}
