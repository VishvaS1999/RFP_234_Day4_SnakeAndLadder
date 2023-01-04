package com.SnakeAndLadder;

public class CheckOptionNoPlayLadderOrSnake_UC3
{
    public static void main(String[] args)
    {
        int playerPosition=0;

        System.out.println("Single Player at Start Position : " +playerPosition);

        int rollsDie=(int)Math.floor(Math.random()*6)+1;

        System.out.println("The Player Rolls The Die Number is : " +rollsDie);

        int randomOption=(int)Math.floor(Math.random()*10)%4;
        System.out.println("random number is :" +randomOption);

        if(randomOption==1)
        {
            System.out.println("Ladder");
            playerPosition=playerPosition+rollsDie;
            System.out.println("Player Position is : " +playerPosition);
        }
        else if (randomOption==2)
        {
            System.out.println("Snake");
            playerPosition=playerPosition-rollsDie;
            System.out.println("Player Position is : " +playerPosition);
        }
        else
        {
            System.out.println("No Play");
            System.out.println("Player Position is : " +playerPosition);
        }
    }
}
