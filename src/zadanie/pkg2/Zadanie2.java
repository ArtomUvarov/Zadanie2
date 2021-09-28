/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie.pkg2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Zadanie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.printf("В веди чесло: ");
        int userNum = scanner.nextInt();
        int x = userNum/100;
        int y = userNum/10%10;
        int z = userNum%10;
        int summa = x+y+z;
        
        System.out.println("симма числа: "+summa);
    }
    
}
