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
public class Manager extends Employee {
    private int bonus;
    
    public Manager(String nameIn, int payrateIn, int reqhoursIn, int entholidaysIn, int bonusIn)
    {
        super(nameIn, payrateIn, reqhoursIn, entholidaysIn);
        bonus = bonusIn;
    }
    
    public boolean setBonus(int bonusIn)
    {
           if(bonusIn >= 0 && bonusIn <= 100 )
           {
               bonus = bonusIn;
               return true;
           }
          return false;
    }
    
    @Override
    public double viewyearlySalary()
    {
        return (bonus*(payrate/100)) + payrate;
    }
}
