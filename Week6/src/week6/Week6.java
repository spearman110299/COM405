/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author 4pears91
 */
public class Week6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int state = 1;
        
            CarPark c1 = new CarPark();
        
                c1.addCar( new Car(123,"Red") );
                c1.addCar( new Car(231,"Purple") );
                c1.addCar( new Car(321,"Green") );
                c1.addCar( new Car(543,"White") );
                c1.addCar( new Car(431,"Black") );
                c1.addCar( new Car(133,"Grey") );
                Scanner scanIn = new Scanner(System.in);
                

        
        
        while(state == 1)
        { 
            
            System.out.println("Please enter one of the following options");
            System.out.println("A - Add a car");
            System.out.println("B Remove a Car");
            System.out.println("C View number of Empty spaces");
            System.out.println("X - Exit");
            
            String input =scanIn.nextLine();
            
            if (input.toLowerCase().equals("a"))
            {
                System.out.println("You have Chosen to add a car\n Please Enter a Car Number:");
               
                
                    
                
            }
            else if (input.toLowerCase().equals("b"))
            {
                System.out.println("You have chosen to remove a car");
            }
            else if (input.toLowerCase().equals("c"))
            {
                System.out.println("Empty Spaces");
            }
            else if (input.toLowerCase().equals("x"))
            {
                state = 0;
            }
            
        }
    scanIn.close();
}
    
}
