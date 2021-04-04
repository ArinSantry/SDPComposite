/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4package;

/**
 *
 * @author erins
 */
public abstract class Parts {
    public abstract String getPartNumber();
    public abstract int getPartCost();
    public abstract void showInfo();
    public abstract void addComponent(Parts component);
    
}
