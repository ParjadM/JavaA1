import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = input.nextInt();
        //check if it's palindrome by calling the method isPalindrome
        //if true it'll print out palindrome
        //else it's not palindrome 
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
    // method that returns true or false if it's palindrome
    public static boolean isPalindrome(int num) {
        //check to see if the number is negative
        if (num < 0) {
            //turn the number into a positive
            num = -num;
        }
        int reverse = 0;
        int remaining = num;
        //loop and reverse the number
        while (remaining != 0) {
            // Extract the last digit
            int digit = remaining % 10;
            // build the number in reverse order
            reverse = reverse *10+ digit;
            // remove the last digit for while loop to continue
            remaining = remaining /10;
        }
        //check if the original number is equal reversed or not
        return num == reverse;
    }
}