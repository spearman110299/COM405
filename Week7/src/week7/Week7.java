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
public class Week7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager m1 = new Manager("bill", 70000, 30, 40, 25);
        Admin a1 = new Admin("ben", 20000, 25, 40);
        a1.setManager(m1);
        
        
    }
    
}
