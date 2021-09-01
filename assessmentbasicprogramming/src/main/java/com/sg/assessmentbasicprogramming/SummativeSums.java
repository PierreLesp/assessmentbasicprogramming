/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assessmentbasicprogramming;

/**
 *
 * @author Pierre L'Espérance
 * @date 09/01/2021
 * @filename SummativeSums.java
 * 
 * to run the file
 * 
 * navigate the folders with
 * 
 * > cd /enter a pathway/
 * 
 * then run
 * 
 * > javac SummativeSums.java
 * 
 * > java SummativeSums
 * 
 * 
 */
public class SummativeSums {
    
    
    
    public static void main(String[] args)
    {
        
        int[] array1 = new int[] { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        
        int[] array2 = new int[] { 999, -60, -77, 14, 160, 301 };
        
        int[] array3 = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
                                        140, 150, 160, 170, 180, 190, 200, -99 } ;
        
        
        System.out.println("#1 Array Sum : " + computeSum(array1));
        System.out.println("#2 Array Sum : " + computeSum(array2));
        System.out.println("#3 Array Sum : " + computeSum(array3));
        
    }
    
    
    /**
     * 
     * @param int[] array   -  prend en parametre un tableau de nombres entiers
     * @return int          -  retourne la somme des valeurs du tableau
     */
    public static int computeSum(int[] array)
    {
        // instanciate variable to sum over the array
        int sum = 0;
        
        // loop over each of the array indexes
        for(int i = 0; i< array.length ; i++)
        {
            sum+= array[i];
        }
        
        return sum;
        
    }
    
    
    
    
    
    
    
    
}
