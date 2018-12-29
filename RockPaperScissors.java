//Made By Ritvik Teegavarapu
//Last Modified 11-22-18
//Objective: Create Rock-Paper-Scissors game

import java.util.*;

public class RockPaperScissors
{
   public static void main(String[] args)
   {
      //Declare variables
      int compMove;
      String nameCompMove;
      String userMove;
      String repeat;
      
      
      //Create necessary objects
      Scanner keyboard = new Scanner(System.in);
      Random randNum = new Random();
      
      System.out.println("Hey there! We're going to play Rock Paper Scissors.");

      
      do
      {
      //Prompt user 
            System.out.println("Enter a move (Rock = R, Paper = P, and Scissors = S).");
      userMove = keyboard.nextLine();
      
      //Input Validation
      while (!userMove.equalsIgnoreCase("R") && !userMove.equalsIgnoreCase("P") &&  !userMove.equalsIgnoreCase("S"))
      {
         System.out.println("That move is invalid. Please enter a valid move.");
         userMove = keyboard.nextLine();
      }
      
      //Calculate user's move
      if (userMove.equalsIgnoreCase("R"))
      {
         userMove = "Rock";
      }
      if (userMove.equalsIgnoreCase("P"))
      {
         userMove = "Paper";
      }
      if (userMove.equalsIgnoreCase("S"))
      {
         userMove = "Scissors";
      }
      
      //Calculate computer's move 
      compMove = randNum.nextInt(3) + 1;
       
      if (compMove == 1)
      {
         nameCompMove = "Rock";
      }
      else if (compMove == 2)
      {
         nameCompMove = "Paper";
      }
      else if (compMove == 3)
      {
         nameCompMove = "Scissors";
      }
      //Meant solely for default purposes
      else 
      {
         nameCompMove = "None";
      }
      
      //Prompt user
      System.out.println("Alright. Both moves have been decided. Let's play!");
      System.out.println("Rock .... Paper ... Scissors .... SHOOT!");
      
      //Determine winning process
      if (userMove.equals(nameCompMove))
      {
         System.out.println("It's a tie!");
      }
      else if (userMove.equals("Rock") && nameCompMove.equals("Paper"))
      {
         System.out.println("You chose rock and the computer chose paper.");
         System.out.println("You lost!");
      }
      else if (userMove.equals("Rock") && nameCompMove.equals("Scissors"))
      {
         System.out.println("You chose rock and the computer chose scissors.");
         System.out.println("You won!");
      }
      else if (userMove.equals("Paper") && nameCompMove.equals("Rock"))
      {
         System.out.println("You chose paper and the computer chose rock.");
         System.out.println("You won!");
      }
      else if (userMove.equals("Paper") && nameCompMove.equals("Scissors"))
      {
         System.out.println("You chose paper and the computer chose scissors.");
         System.out.println("You lost!");
      }
      else if (userMove.equals("Scissors") && nameCompMove.equals("Rock"))
      {
         System.out.println("You chose scissors and the computer chose rock.");
         System.out.println("You lost!");
      }
      else if (userMove.equals("Scissors") && nameCompMove.equals("Paper"))
      {
         System.out.println("You chose scissors and the computer chose paper.");
         System.out.println("You won!");
      }
      else 
      {
         System.out.println("Congrats, you broke the system.");
      }
      
      System.out.println("Would you like to play again?");
      repeat = keyboard.nextLine();
      
      }
      while (repeat.equalsIgnoreCase("yes"));
   }
}



