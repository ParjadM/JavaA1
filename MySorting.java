import java.util.Scanner;

public class MySorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //request the user to enter three numbers
        System.out.print("Please enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        //call the method displaySortedNumbers and pass three number the user entered
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        //create temp value to use to find the largest number
        double temp;
        //using the if statement and swaping number
        //finding the largest number
        //num3 being the greatest and num1 being the smallest
        //If num1 is greater than num2, swap num1 and num2.
        if (num1 > num2) {
            //put num1 into value temp
            temp = num1;
            // see if num1 equals num2
            num1 = num2;
            // put temp in num2 since num1 is greater
            num2 = temp;
        }
        // If num2 is greater than num3, swap num2 and num3.
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        // After the previous two swaps, the largest number is now in num3.
        // so we need to find which one is bigger num1 or num2 and swap them in order
        // If num1 is still greater than num2, swap num1 and num2.
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        //print out the numbers in order from least to greatest
        System.out.println("The numbers in increasing order are " + num1 + " " + num2 + " " + num3);
    }
}