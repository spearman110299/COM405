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
public class Employee {
    protected String name;
    protected int payrate;
    protected int reqhours;
    protected int entholidays;

    public Employee(String nameIn, int payrateIn, int reqhoursIn, int entholidaysIn)
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
    public int getPayRate()
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
    
    
    public int BookHoliday(int reduceby)
    {
        
        
        if(entholidays-reduceby>0)
        {
            entholidays=entholidays-reduceby;
            //entholidays -= reduceby;
        }
        else
        {
            System.out.println("This employee has no holidays left");
        }
        return entholidays;
    }
    
    public int changePayrate(int newpayrate)
       
        {
             payrate = newpayrate;  
             return payrate;
        }
    
    public int viewyearlySalary()
        
        {
            int yearlysalary = payrate;
            return yearlysalary;
        }
    
    
}
