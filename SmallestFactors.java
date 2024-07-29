import java.util.Scanner;
public class SmallestFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        //call the SmallestFactors method
        SmallestFactors(num);
    }
    public static void SmallestFactors(int num) {
        //initialize two variables
        int highFactor = 1;
        int numcopy = num;
        //there are three phases
        //phase 1: Find and print factors up to the square root
        //finding the highest factor
        for (int i = 2; i * i <= num; ) {
            if (num % i == 0) {
                highFactor = i;
                num /= i;
            } else {
                i++;
            }
        }
       //phase 2: Print the remaining factor
       //if it's greater than 1
       //it prints out the num
        if (num > 1) {
            System.out.print(num + ", ");
       }
        //phase 3: finding the remaining number
        //Print reversed factors from highFactor down to 2
        for (int i = highFactor; i >= 2; i--) {
            while (numcopy % i == 0) {
                //prints it in reverse order
                System.out.print(i + ", ");
                //divide to remove the factor, so it can go to the next number
                numcopy /= i;
            }
        }
        //extra
        //delete the last two extra character
        System.out.println("\b\b");
    }
}