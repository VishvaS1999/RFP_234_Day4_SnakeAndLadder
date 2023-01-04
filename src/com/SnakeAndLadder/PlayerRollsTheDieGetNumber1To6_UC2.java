package com.SnakeAndLadder;

public class PlayerRollsTheDieGetNumber1To6_UC2
{
    public static void main(String[] args)
    {
     int playerPosition=0;

        System.out.println("Single Player at Start Position : " +playerPosition);

        int rollsDie=(int)Math.floor(Math.random()*6)+1;

        System.out.println("The Player Rolls The Die Number is : " +rollsDie);
    }
}

