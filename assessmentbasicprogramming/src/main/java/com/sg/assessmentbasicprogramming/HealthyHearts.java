/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assessmentbasicprogramming;

import java.util.Scanner;

/**
 *
 * @author Pierre L'Espérance
 * @date 09/01/2021
 * @filename HealthyHearts.java
 * 
 * to run the file
 * 
 * navigate the folders with
 * 
 * > cd /enter a pathway/
 * 
 * then run
 * 
 * > javac HealthyHearts.java
 * 
 * > java HealthyHearts
 */
public class HealthyHearts {
    
    public static void main(String[] args)
    {
        // instanciating Scanner Object
        Scanner sc = new Scanner(System.in);
        
        
        // instanciating variable for user input : age
        int ageInput = 0;
        
        while(true)
        {
            try{
                // Prompt to enter value
                System.out.println("What is your age?");
                // call Scanner method ro read from keyboard
                ageInput = Integer.parseInt(sc.nextLine());
                // get out of the infinite loop
                break;
                
            }catch(Exception e)
            {
                System.out.println("INVALID INPUT");
            }
            
        }
        
        // assign max heart rate
        int max = (220-ageInput);
        
        // display value
        System.out.println("Your maximum heart rate should be "+ max +" beats per minute");
        
        // assign upper and lower bound
        int lower =(int) (0.5f*max);
        int upper = (int) (0.85f*max);
        
        // display range
        System.out.println("Your target HR Zone is "+ lower +" - "+ upper +" beats per minute");
        
        
        
        
    }
    
    
}
