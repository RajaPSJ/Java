/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boiling;

/**
 *
 * @author rajap
 */
import java.util.Scanner;
public class BoilingAndFreezing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give the temperature value");
        Scanner SC = new Scanner(System.in);
        int temp = SC.nextInt();
        if(temp>=100)
        {
            System.out.println("The water is boiling.");
        }
        else if (temp<=0)
        
        {
            System.out.println("the water is freezing.");
        }
        else
        {
                System.out.println("the water is in normalstate.");
                }
    }
    
}
