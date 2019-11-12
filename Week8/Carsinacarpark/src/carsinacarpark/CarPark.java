/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsinacarpark;

/**
 *
 * @author 4pears91
 */
public class CarPark 
{
   
    private Car[] parkedcars;
    
    public CarPark()
    {
        parkedcars = new Car[15];
    }
    
    public boolean addCar(Car carIn)
    {
        for(int i=0; i<parkedcars.length; i++)
        {
            if(parkedcars[i] == null)
            {
                parkedcars[i] = carIn;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeCar(String reg)
    {
        for(int i=0; i<parkedcars.length; i++)
        {
            if(parkedcars[i] != null)
            {
                if(parkedcars[i].getReg().equals(reg))
                {
                    parkedcars[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
    public int calcEmptySpaces()
    {
        int tally = 0;
        for(int i=0; i<parkedcars.length; i++)
        {
            if(parkedcars[i] == null)
            {
                tally++;
            }
        }
        return tally;
    }
    
    
    
}
