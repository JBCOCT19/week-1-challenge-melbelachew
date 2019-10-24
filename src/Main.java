
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] agrs){
        Scanner key = new Scanner(System.in);


        String playAgain = "y";


        while(playAgain.equalsIgnoreCase("y")) {

            System.out.println("Would you like to generate a random number or input a number? (R/I)");
            String userChoice = key.next();
            if (userChoice.equalsIgnoreCase("i")) {
                System.out.println("enter a number greater than 1");
                int userInput = key.nextInt();
                int remaining = 10;
                boolean isPrime = true;


                for (int i = userInput - 1; i > 1; i--) {

                    remaining = userInput % i;
                    if (remaining == 0) {
                        isPrime = false;
                        break;
                    }

                }
                //        System.out.println(isPrime);

                if (isPrime) {
                    System.out.println(userInput + " is a prime number");
                } else {
                    System.out.printf(userInput + " is not a prime number");
                }


                System.out.println();
            } else {
                //part two of the challenge

                Random r = new Random();

                int x = 2 + r.nextInt(251);
                int remainder = 10;
                boolean isRandPrime = true;

                for (int i = x - 1; i > 1; i--) {

                    remainder = x % i;
                    if (remainder == 0) {
                        isRandPrime = false;
                        break;
                    }

                }
//        System.out.println(isRandPrime);

                if (isRandPrime) {
                    System.out.println(x + " is a prime number");
                } else {
                    System.out.println(x + " is not a prime number");
                }

            }
            System.out.println("Would you like to try again? (Y/N)");
            playAgain = key.next();
        }
    }


        }







