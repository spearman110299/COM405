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
public class Car {
     private String registrationnumber;
     private String carcolor;
     private String carmake;
     private String carmodel;
    
    public Car(String regIn, String colorIn, String makeIn, String modelIn)
    {
        registrationnumber = regIn;
        carcolor = colorIn;
        carmake = makeIn;
        carmodel = modelIn;
    }
    
    public String getRegistrationNumber()
    {
        return registrationnumber;
    }
    
    
   public String getCarColor()
    {
        return carcolor;
    }
   
   public String getCarMake()
    {
        return carmake;
    }
   
   public String getCarModel()
    {
        return carmodel;
    }
}
