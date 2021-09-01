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
 * @filename RockPaperScissors.java
 * 
 * to run the file
 * 
 * navigate the folders with
 * 
 * > cd /enter a pathway/
 * 
 * then run
 * 
 * > javac RockPaperScissors.java
 * 
 * > java RockPaperScissors
 */
public class RockPaperScissors {
    
    
    public static void main(String[] args)
    {
        
        
        Scanner sc = new Scanner(System.in);
        
        
        
        String inputcontinue = "Y";
        
        
        while("Y".equalsIgnoreCase(inputcontinue))
        {
            
            System.out.println("\nWelcome to Rock Paper Scissors");
            
            
            int n = 0;

            // MAKE USER SELECT NUMBER OF ROUNDS n
            while(true)
            {
                try
                {
                    System.out.println("How many rounds do you wish to play?");
                    System.out.println("Please enter a valid integer from 1 to 10");
                    n = Integer.parseInt(sc.nextLine());
                    if(n < 1 || n>10)
                    {
                        System.out.println("\nINPUT IS INVALID\n");
                        continue;
                    }
                    break;
                }
                catch(Exception e)
                {
                    System.out.println("\nINPUT IS INVALID\n");
                }
            }
            
            
            int counttie = 0;
            int countwin = 0;
            int countloss = 0;
            
            
            
            for(int i =0 ; i<n ; i++)
            {
                //ROUND i
                
                // make user select
                String userrpsinput = playerSelection(sc);
                
                // randomly chose for cpu
                String cpurpsinput = cpuSelection();

                // display current round information                
                System.out.println("ROUND "+(i+1)+"/"+n);
                
                System.out.println("USER : "+ userrpsinput);
                System.out.println("CPU  : "+ cpurpsinput);
                
                if(cpurpsinput.equalsIgnoreCase(userrpsinput))
                {
                    System.out.println("TIE");
                    counttie++;
                }
                else if (("rock".equalsIgnoreCase(userrpsinput)&&"scissors".equalsIgnoreCase(cpurpsinput))
                        ||("paper".equalsIgnoreCase(userrpsinput)&&"rock".equalsIgnoreCase(cpurpsinput))
                        ||("scissors".equalsIgnoreCase(userrpsinput)&&"paper".equalsIgnoreCase(cpurpsinput)))
                {
                    System.out.println("YOU WIN!");
                    countwin++;
                }
                else if (("rock".equalsIgnoreCase(cpurpsinput)&&"scissors".equalsIgnoreCase(userrpsinput))
                        ||("paper".equalsIgnoreCase(cpurpsinput)&&"rock".equalsIgnoreCase(userrpsinput))
                        ||("scissors".equalsIgnoreCase(cpurpsinput)&&"paper".equalsIgnoreCase(userrpsinput)))
                {
                    System.out.println("YOU LOSE !");
                    countloss++;
                }
                else
                {
                    System.out.println("ERROR DEBUGG THE CODE");
                }
                
                System.out.println("PRESS ENTER TO CONTINUE");
                sc.nextLine();
                
                
            }// end of loop for

            
            // display session winner for 1-10 rounds
            System.out.println("RESULTS AFTER "+ n + " ROUNDS :");
            System.out.println("WINS - LOSSES - TIES");
            System.out.println(countwin + " - " + countloss + " - " + counttie);
            
            // DISPLAY WINNER
            System.out.println("AND THE WINNER IS : ");
            if (countwin == countloss )
            {
                System.out.println("IT'S A TIE");
            }
            else if (countwin>countloss)
            {
                System.out.println("USER");
            }else
            {
                System.out.println("CPU");
            }
            
            
            // prompt user to continue
            while(true)
            {
                System.out.println("Do you want to play again?");
                System.out.println("Press Y then ENTER to continue");
                System.out.println("Press N then ENTER to exit");

                inputcontinue = sc.nextLine();
                
                if(!"y".equalsIgnoreCase(inputcontinue) && !"n".equalsIgnoreCase(inputcontinue))
                {
                    System.out.println("\nINVALID INPUT\n");
                    continue;
                }
                
                break;
            }
            
        }
        
        System.out.println("Thanks for playing!");
        
        
        
        
    }// end main method
    
    
    /**
     * @author Pierre L'Espérance
     * @date 09/01/2021
     * 
     * @param sc Scanner build-in class
     * @return String 'rock' || 'paper' || 'scissors'
     * return value is based on player's input
     */
    private static String playerSelection(Scanner sc) {
        
        
        String input = "";
        
        while(true)
        {
            System.out.println("Select between 'rock' 'paper' 'scissors'");
            System.out.println("Type your selection then press ENTER");
            
            input = sc.nextLine();
            
            if(!"rock".equalsIgnoreCase(input) && !"paper".equalsIgnoreCase(input) && !"scissors".equalsIgnoreCase(input))
            {
                continue;
            }
            
            break;
        }
        
        
        return input.toLowerCase();
    }
    
    
    /**
     * @author Pierre L'Espérance
     * @date 09/01/2021
     * 
     * takes no parameters
     * @return String 'rock' || 'paper' || 'scissors'
     * return value based on Random Number Generator
     */
    private static String cpuSelection()
    {
        Random randGen = new Random();
        
        float myFloat = 3.0f*randGen.nextFloat();
        
        if(myFloat < 1.0)
        {
            return "rock";
        }
        else if (myFloat < 2.0)
        {
            return "paper";
        }
        else
        {
            return "scissors";
        }
    }
    
    
    
}
