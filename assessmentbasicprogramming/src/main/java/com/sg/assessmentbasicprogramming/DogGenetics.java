/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assessmentbasicprogramming;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pierre L'Espérance
 * @date 09/01/2021
 * @filename DogGenetics.java
 * 
 * to run the file
 * 
 * navigate the folders with
 * 
 * > cd /enter a pathway/
 * 
 * then run
 * 
 * > javac DogGenetics.java
 * 
 * > java DogGenetics
 * 
 * 
 */

public class DogGenetics {
    
    
    public static void main(String[] args)
    {
        
        // we'll use a Scanner later
        Scanner sc = new Scanner(System.in);
        
        // Greet Customer
        // ask for dog name
        System.out.println("WELCOME TO DOG GENETICS");
        System.out.println("Please provide us with the name of your pet");
        System.out.println("then press RETURN");
        // use Scanner to store input value
        String dogName = sc.nextLine();
        
        
        Random randGen = new Random();
        
        //Assigning 5 different values
        int v1 = randGen.nextInt(20);
        int v2 = randGen.nextInt(8);
        int v3 = randGen.nextInt(56);
        int v4 = randGen.nextInt(14);
        int v5 = 100 - v1 - v2 - v3 - v4;
        
        // Display fake information about the dog
        System.out.println("Well then, I have this highly reliable report on "+ dogName +"'s prestigious background right here.");
        
        System.out.println("\n"+dogName+" is : \n");
        
        
        System.out.println(v1 +"  St. Bernard");
        System.out.println(v2 +"  Chihuahua");
        System.out.println(v3 +"  Dramatic RedNosed Asian Pug");
        System.out.println(v4 +"  Common Cur");
        System.out.println(v5 +"  King Doberman");
        
        
        
        //the outro
        System.out.println("\nWow, that's QUITE the dog!");
        
        
    }
    
    
    
    
    
    
    
}
