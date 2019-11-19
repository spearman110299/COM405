/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author 4pears91
 */
public class Car {
     private int currentSpeed;
    private int maxSpeed;
    private int fuelLevel;
    private int maxFuel;
    
    
    public int getCurrentSpeed()
{
 return currentSpeed;
}
    public int getMaxSpeed()
{
 return maxSpeed;
}
    public int getFuelLevel()
{
 return fuelLevel;
    
}         
    public int getMaxFuel()
    {
        return maxFuel;
    }
    public void setCurrent(int currentIn)
    {
        currentSpeed = currentIn;
    }
    
    public void setMax(int maxIn)
    {
        maxSpeed = maxIn;
    }
    
    public void setFuel(int fuelIn)
    {
        fuelLevel = fuelIn;
    }
    
    
    public void accelerate()
    {
       
        currentSpeed= currentSpeed+5;
        fuelLevel=fuelLevel-20;
        
        if(currentSpeed> maxSpeed)
        {
            currentSpeed = maxSpeed;
        }
    }
    
    public void brake() 
    {
        currentSpeed=currentSpeed-5;
        
    }
     
    public void refuel() 
    {
        fuelLevel=fuelLevel+40;
        
        if(fuelLevel>maxFuel)
        {
            fuelLevel = maxFuel;
        }
    }
    
    public Car()
    {
        currentSpeed = 40;
        maxSpeed = 80;
        fuelLevel = 50;
        maxFuel = 100;
        
    }
    
    public Car(int currentIn, int maxIn)
    {
        currentSpeed = currentIn;
        maxSpeed = maxIn;
        fuelLevel = 50;
        
        
    }
}



