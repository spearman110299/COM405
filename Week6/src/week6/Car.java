/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author 4pears91
 */
public class Car {
    private int carnumber;
    private String carcolor;
  
    public Car (int carnumberIn, String carcolorIn)
    {
        carnumber = carnumberIn;
        carcolor = carcolorIn;
    }
    public int getCarNumber()
    {
        return carnumber;
    }
    public String getCarColor()
    {
        return carcolor;
    }
}
