package com.SnakeAndLadder;

import java.util.Random;

public class PositionAfterEveryDieRole_UC6
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int singlePlayer = 0;
        int count = 0;
        System.out.println("Starting Position of Single Player is :" + singlePlayer);

        while (singlePlayer != 100)
        {
            count++;
            int die = random.nextInt(6) + 1;
            int a = random.nextInt(3);
            System.out.println();
            System.out.println("Player Rolls The Die & Get a Number :" + die);
            if (a == 1)
            {
                singlePlayer =singlePlayer + die;
                System.out.println("Gets a Ladder & Player Moves ahead By Number Of Position :" + singlePlayer);

                if (singlePlayer > 100)
                {
                    singlePlayer = 100;
                    System.out.println("Player Current Position :" + singlePlayer);
                }
            }
            else if (a == 2)
            {
                singlePlayer =singlePlayer - die;
                System.out.println("Bites By Snake & Player Moves Behind By Number Of Position :" + singlePlayer);

                if ( singlePlayer < 0)
                {
                    singlePlayer = 0;
                    System.out.println("Player Current Position :" + singlePlayer);
                }
            }
            else
            {
                System.out.println("No Play - Player Stay Same Position");
            }
            System.out.println("The Number Guess more 100");
            System.out.println("Therefore Player Current Position: " + singlePlayer);
            System.out.println("The Number Required By Player is: " + (100 - singlePlayer));
        }
        System.out.println();
        System.out.println("Number of times player played: " + count);
    }
}
