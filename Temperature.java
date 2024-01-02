/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

/**
 *
 * @author rajap
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give in the Celsius Value: ");
        java.util.Scanner SC = new java.util.Scanner(System.in);
        double celsius = SC.nextDouble();
        double fahrenheit = 9.0/5.0 * celsius + 32.0;
        System.out.println("Fahrenheit:" + fahrenheit);
              
    }
    
}
