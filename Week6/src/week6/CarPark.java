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
public class CarPark {

    private Car[] carpark;

    public CarPark() {
        carpark = new Car[15];
    }

    public boolean addCar(Car carIn) {
        for (int i = 0; i < carpark.length; i++) {
            if (carpark[i] == null) {
                carpark[i] = carIn;
                return true;
            }
        }
        return false;
    }
    

    public boolean removeCar(int carIn) {
        for (int i = 0; i < carpark.length; i++) {
            if (carpark[i] != null) {
                int carid = carpark[i].getCarNumber();
                if (carid == carIn) {
                    carpark[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
    public Car getCar(int CarNumber){
         for (int i = 0; i < carpark.length; i++)
         {
             if(carpark[i] != null)
             {
                 if (CarNumber == carpark[i].getCarNumber())
                 {
                     return carpark[i];
                 }
             }
         }
        return null;
    }
    
    
    
}