/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minutesconversion;

/**
 *
 * @author 25019666
 */
import java.util.Scanner;
public class MinutesConversion {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter the number of minutes:");
        double minute = input.nextDouble();
        double hour = minute/60;
        System.out.println("The hours are:" + hour);
        double day = hour/24;
        System.out.println("The number of days is:" + day);
                
        
    }
}
