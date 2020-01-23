package homework3;
//Task 3

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Randomize {

    public static void main(String[] args) {

        System.out.println("Play game");
        GuessTheNumber();

    }

        public static void GuessTheNumber () {

            Scanner in = new Scanner(System.in);
            System.out.println("Guess the number 0 - 9. Try 3 times.");
            int number = (int) (Math.random() * 10);
            for (int x = 0; x < 3; x++) {
                System.out.println("Try " + (x + 1) + ": ");
                int a = in.nextInt();
                if (a < number) System.out.println("Number > than yours");
                if (a > number) System.out.println("Number < than yours");
                if (a == number) {
                    System.out.println("Right you are");
                    System.out.println("Try one more time? 1 – yes / 0 – no");
                    a = in.nextInt();
                    if (a == 1) GuessTheNumber();
                    else {
                        System.exit(0);
                    }
                }
            }
            System.out.println("Wrong answer");
            System.out.println("Try one more time? 1 – yes / 0 – no");
            int a = in.nextInt();
            if (a == 1) GuessTheNumber();
            else {
                System.exit(0);
            }
        }
    }
