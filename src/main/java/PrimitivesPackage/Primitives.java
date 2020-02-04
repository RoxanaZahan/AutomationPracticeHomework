package PrimitivesPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Primitives {

        //Practice with numbers
    public void convertFahrenheitToCelsius(int fahrenheit) {
        System.out.println("Exercise 1. - convert Fahrenheit to celsius");
        System.out.println(fahrenheit + "F = " + (fahrenheit - 32) * 5 / 9 + " C");
        System.out.println("");
    }

    public void convertInchesToMeters(double inches) {
        System.out.println("Exercise 2. - convert inches to meters");
        System.out.println(inches + (inches == 1 ? " inch" : " inches") + " = " + inches * 0.0254 + (inches * 0.0254 == 1 ? " meter" : " meters"));
        System.out.println("");
    }

    public void makeOperationsWithNumbers(int number1, int number2) {
        System.out.println("Exercise 3. - several operations with numbers");
        System.out.println("First number is: " + number1);
        System.out.println("Second number is: " + number2);
        System.out.println("The sum is: " + (number1 + number2));
        System.out.println("The difference is: " + (number1 - number2));
        System.out.println("The product is: " + (number1 * number2));
        System.out.println("The average is: " + ((double)(number1 + number2) / 2));
        System.out.println("The distance between the numbers is: " + ((number1 - number2) < 0 ? -(number1 - number2) : (number1 - number2)));
        System.out.println("The biggest number is: " + Math.max(number1, number2));
        System.out.println("The smallest number is: " + Math.min(number1, number2));
        System.out.println("");
    }

        //Practice with chars - convert string to chars
    public void getChars(String string) {
        System.out.println("Exercise 4. - convert string to chars and print on different lines");
        for (int n = 0; n < string.length(); n++) {
            System.out.println(string.charAt(n));
        }
        System.out.println("");
    }

    public void countChars(String string) {
        int letter = 0;
        int num = 0;
        int space = 0;
        int other = 0;
        for(int i = 0; i < string.length(); i++){
            if(Character.isLetter(string.charAt(i))){
                letter ++;
            }
            else if(Character.isDigit(string.charAt(i))){
                num ++;
            }
            else if(Character.isSpaceChar(string.charAt(i))){
                space ++;
            }
            else{
                other ++;
            }
        }
        System.out.println("Exercise 5. - count characters");
        System.out.println("Your string has: ");
        System.out.println("letters: " + letter);
        System.out.println("spaces: " + space);
        System.out.println("numbers: " + num);
        System.out.println("other: " + other);
        System.out.println("");
    }

    public void getLetters(String string) {
        String temporaryString = "";
        for (int n = 0; n < string.length(); n++) {
            if(Character.isLetter(string.charAt(n))) {
                temporaryString = temporaryString + string.charAt(n);
            }
        }
        System.out.println("Exercise 6. - extract letters only");
        System.out.println(temporaryString);
        System.out.println("");
    }

        //Practice with booleans
    public void countOddAndEvenNumbers(int[] numArray) {
        int evenNumbers = 0;
        int oddNumbers = 0;
        for(int i = 0; i < numArray.length; i++) {
            if(numArray[i] % 2 == 0)
            {
                evenNumbers++;
            }
            else
                oddNumbers++;
        }
        System.out.println("Exercise 7. - count odd numbers and even numbers in array");
        System.out.println("Number of even elements in the array: " + evenNumbers);
        System.out.println("Number of odd elements in the array: " + oddNumbers);
        System.out.println("");
    }


    Scanner scanner = new Scanner(System.in);

    public void guessNumber() {
        System.out.println("Exercise 8. - play a guessing number game. Be aware...you have ONLY 2 choices.");
        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);;
        System.out.println("Choose a number from 1 to 5: ");
        int userInput = scanner.nextInt();

        if (userInput == randomNumber) {
            System.out.println("Correct! Aren't you lucky.");
        } else {
            System.out.println("Give it another go: ");
            userInput = scanner.nextInt();
            if (userInput == randomNumber) {
                System.out.println("Correct! About time.");
            } else {
                System.out.println("Hard luck! Maybe next time.");
                System.out.println("Correct number is: " + randomNumber);
            }
        }
    }

}
