package com.SnakeAndLadder;

import java.util.Random;

public class RepeatTillPlayerReachWinnPosition100_UC4
{
    public static void main(String[] args)
    {

        Random random = new Random();
        int singlePlayer = 0;
        System.out.println("Starting Position of Single Player is :" + singlePlayer);

        while (singlePlayer != 100)
        {
            int die = random.nextInt(6) + 1;
            int a = random.nextInt(3);
            System.out.println();
            System.out.println("Player Rolls The Die & Get a Number :" + die);
            if (a == 1)
            {
                singlePlayer += die;
                System.out.println("Gets a Ladder & Player Moves ahead By Number Of Position :" + singlePlayer);
                System.out.println("Player Current Position :" + singlePlayer);
            }
            else if (a == 2)
            {
                singlePlayer =singlePlayer - die;
                if ( singlePlayer < 0)
                {
                    singlePlayer = 0;
                    System.out.println("Bites By Snake & Player Moves Behind By Number Of Position :" + singlePlayer);
                    System.out.println("Player Current Position :" + singlePlayer);
                }
            }
            else
            {
                System.out.println("No Play - Player Stay At Same Position");
            }
        }
        System.out.println();
        System.out.println("Player Reaches position: " +singlePlayer);
    }

}
