/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fighting;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rajap
 */
public class Fighting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Attack Points of Monster:");
        int monsterattack = sc.nextInt();
        System.out.println("Deffence Points of Monster:");
        int monsterdeffence = sc.nextInt();
        System.out.println("Damage of Monster:");
        int monsterdamage = sc.nextInt();
        System.out.println("Life point of Monster:");
        int monsterlife = sc.nextInt();
        System.out.println("Your Attack Points:");
        int yourattack = sc.nextInt();
        System.out.println("Your Defence Points:");
        int yourdefence = sc.nextInt();
        System.out.println("Your Damage");
        int yourdamage = sc.nextInt();
        System.out.println("Your Life Points: ");
        int yourlife = sc.nextInt();
        
        Random generator = new Random();
        boolean attacker = generator.nextBoolean();
        if (attacker)
        {
            System.out.println("You attack");
            int dice = generator.nextInt(6)+1+generator.nextInt(6)+1;
            int attackvalue = yourattack +dice;
            System.out.println("Rolled Values:"+dice);
            System.out.println("Your Attack Value :"+attackvalue);
            if (attackvalue>monsterdeffence)
            {
                System.out.println("Your Attack was Successfull.");
                monsterlife = monsterlife - yourdamage;
                System.out.println("Monster's remaining Life Points:"+monsterlife);
            }
            else
            {
                System.out.println("Your Attack was not Successfull.");
            }
            
        }
        
        else
        {
            System.out.println("Monster's Attack was not Sucessfull.");
        }
    }
    
}
