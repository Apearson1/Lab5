package com.company;




import java.util.Random;

public static  void main(String[] args)

 import java.util.Scanner;



public class Player.java; {
    public static void main(String[] args){
        String player;
        String playerAnswer;
        Boolean answer = true;
        int RoundScore;
        int TotalScore;
        int playerScore;
        int Round;
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your First Name to play!");
        player = user.nextLine();
        playerAnswer = user.nextLine();
        {
            System.out.println("Your Name:" + "" + player);
            System.out.println("Welcome" + "" + player + "" + "To Dice Game");
            System.out.println("Enter Y to Roll or R to STop:[Y or N]" + "" + playerAnswer.toUpperCase());
        }
    }
}



 class Dice{
    public static void main(String[] args){

        Random dice = new Random();
        int number = 0;
        for(int counter = 1; counter <= 1; counter++)
            number = 1 + dice.nextInt(18);
        System.out.println(number + "");
    }
}
