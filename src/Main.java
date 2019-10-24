import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] agrs){
        Scanner key = new Scanner(System.in);
        System.out.println("enter a number greater than 1");
        int userInput = key.nextInt();
        int remaining=10;
        boolean isPrime = true;


            for (int i = userInput - 1; i > 1; i--) {

                remaining = userInput % i;
                if(remaining==0){
                    isPrime = false;
                    break;
                }

                }
//        System.out.println(isPrime);

            if(isPrime){
                System.out.println(userInput + " is prime");
            }
            else {
                System.out.printf(userInput + " is not prime");
            }

        System.out.println();

            //part two of the challenge

        Random r = new Random();

            int x = 2+r.nextInt(251);
            int remainder = 10;
            boolean isRandPrime = true;

        for (int i = x - 1; i > 1; i--) {

            remainder = x % i;
            if(remainder==0){
                isRandPrime = false;
                break;
            }

        }
//        System.out.println(isRandPrime);

        if(isRandPrime){
            System.out.println(x + " is prime");
        }
        else {
            System.out.println(x + " is not prime");
        }


    }


        }







