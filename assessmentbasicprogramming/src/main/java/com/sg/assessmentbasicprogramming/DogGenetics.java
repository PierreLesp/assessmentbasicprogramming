/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assessmentbasicprogramming;

import java.util.ArrayList;
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

/**
 * 
 * @author Pierre L'Espérance
 * 
 * Many updates for the second push on the repo
 * 
 * Completed the first bonus assignment on slack
 * I red the message sent by David Albeck
 * 
 * So I updated my version of the file
 * 
 * to comply with the new requirements
 * 
 * many dog breeds, more than 5, like 10
 * 
 * then select a random number of breeds to display
 * 
 * Then display only valid rates of breeds
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
        
        // instanciating a Random Number Generator
        Random randGen = new Random();
        
        
        //create an array of breads
        
        String[] breedsArray = new String[] {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman", "German Shepherd", "German Spitz", "Golden Retriever", "Horgi", "Pomsky", "Pomchi", "Transylvanian Hound", "Valley Bulldog"};
        
        ArrayList indexes = new ArrayList();
        
        // Assigning random number between 3-6 for the amount of displayed breeds.
        int nbOfBreeds = selectNumberOfBreeds(randGen);
        
        // Generating first index
        indexes.add(randGen.nextInt(breedsArray.length));
        
        // Generating random number of indexes
        for(int i = 1 ; i<nbOfBreeds ; )
        {
            int temp = randGen.nextInt(breedsArray.length);
            if(indexes.contains(temp))
            {
                continue;
            }
            else
            {
                indexes.add(temp);
            }
            i++;
        }
        
        // instanciating the array of float v
        // v will hold the values of the different breeds
        // the rate of the historical data
        float[] v = new float[nbOfBreeds];
        
        // 
        // the following code assign different values to array of float v
        
        
        // change to 2^n        - with n the nth Generation for realistic modeling
        int niter= 2^5;
        
        
        // assign random rates with realistic modeling
        for(int i =0 ; i<niter; i++)
        {
            int ii = randGen.nextInt(nbOfBreeds);
            v[ii] += 100.0f/(float) niter;
        }
        
        

                
                
        // Display fake information about the dog
        System.out.println("Well then, I have this highly reliable report on "+ dogName +"'s prestigious background right here.");
        
        System.out.println("\n"+dogName+" is : \n");
        
        // data formatting support
        ArrayList selectedBreeds = new ArrayList();
        for(int i =0 ; i< nbOfBreeds ; i++)
        {
            if(v[i]==0.0f)
            {
                continue;
            }
            // data formatting
            selectedBreeds.add(v[i] + "% " + breedsArray[(int) indexes.get(i)]);
            
        }
        
        // Display Data
        for (Object output : selectedBreeds)
        {
            System.out.println(output);
        }
        
        //the outro
        System.out.println("\nWow, that's QUITE the dog!");
    }

    
    /**
     * 
     * @param randGen
     * @return a random value between 6 and 3
     */
    private static int selectNumberOfBreeds(Random randGen) 
    {
        int temp = randGen.nextInt(4);
        return (6 - temp);
        
    }
    
    
    
    
    
    
    
}
