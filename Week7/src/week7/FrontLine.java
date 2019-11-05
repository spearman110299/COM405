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
public class FrontLine extends Employee {
    
    public FrontLine(String nameIn, int payrateIn, int reqhoursIn, int entholidaysIn)
    {
        super(nameIn, payrateIn, reqhoursIn, entholidaysIn);
    }
    
    /**
     *
     * @return
     */
    @Override
    public double viewyearlySalary()
    {
        return (payrate * reqhours) * 52;
    }
}
