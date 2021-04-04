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
public class TestClient {
    public static void main(String[] args)
    {
        //Honda engine
        Parts primaryPart = new PrimaryPart("Honda", "Engine");
        
        Parts component = new Component("Cylinder system");        
        primaryPart.addComponent(component);
        
        component = new Component("Piston");
        primaryPart.addComponent(component);
        
        component = new Component("Spark plug");
        primaryPart.addComponent(component);
        
        component = new Component("Crankshaft");
        primaryPart.addComponent(component);
        
        primaryPart.showInfo();
        
        //Acura engine
        primaryPart = new PrimaryPart("Acura", "Engine");
        
        component = new Component("Cylinder system");        
        primaryPart.addComponent(component);
        
        component = new Component("Piston");
        primaryPart.addComponent(component);
        
        component = new Component("Spark plug");
        primaryPart.addComponent(component);
        
        component = new Component("Crankshaft");
        primaryPart.addComponent(component);
        
        primaryPart.showInfo();
        
        //Honda tire
        primaryPart = new PrimaryPart("Honda", "Tire");
        
        component = new Component("Bolts");
        primaryPart.addComponent(component);
        
        component = new Component("Wheel");
        primaryPart.addComponent(component);
        
        component = new Component("Hubcap");
        primaryPart.addComponent(component);
        
        component = new Component("Sensor");
        primaryPart.addComponent(component);
        
        primaryPart.showInfo();
        
        //Acura tire
        primaryPart = new PrimaryPart("Acura", "Tire");
        
        component = new Component("Bolts");
        primaryPart.addComponent(component);
        
        component = new Component("Wheel");
        primaryPart.addComponent(component);
        
        component = new Component("Hubcap");
        primaryPart.addComponent(component);
        
        component = new Component("Sensor");
        primaryPart.addComponent(component);
        
        primaryPart.showInfo();
    }
}
