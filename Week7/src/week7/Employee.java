/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author 4pears91
 */
public abstract class Employee {
    protected String name;
    protected double payrate;
    protected int reqhours;
    protected int entholidays;

    public Employee(String nameIn, double payrateIn, int reqhoursIn, int entholidaysIn)
    {
        name = nameIn;
        payrate = payrateIn;
        reqhours = reqhoursIn;
        entholidays = entholidaysIn;
               
        
    }
    
    public String getName()
    {
        return name;
    }
    public double getPayRate()
    {
        return payrate;
    }
    public int getReqHours()
    {
        return reqhours;
    }
    public int getEntHolidays()
    {
        return entholidays;
    }
    
    
    public boolean BookHoliday(int reduceby)
    {
        
        
        if(entholidays-reduceby>0)
        {
            entholidays=entholidays-reduceby;
            return true;
            //entholidays -= reduceby;
        }
        return false;
        
    }
    
    public void setPayrate(double payrateIn)
       
        {
             payrate = payrateIn;  
             
        }
    public boolean SetHours(int reqhoursIn)
    {
        if(reqhoursIn <=40)
        {
            reqhours = reqhoursIn;
            return true;
        }
        return false;
    }
   
    public abstract double viewyearlySalary();
        
      
    public String getDetails()
    {
        return name + " " + entholidays + " " + viewyearlySalary();
    }
    
    
}
