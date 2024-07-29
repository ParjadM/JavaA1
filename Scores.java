import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Scores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the number of students
        System.out.print("Please enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // create an array with the size of number of students
        double[] scores = new double[numberOfStudents];

        // prompt the user to enter the score
        //the number of scores is the size of number of students
        System.out.print("Enter " + numberOfStudents + " scores: ");
        //loop and ask for score according to the number of students
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextDouble();
        }

        // Get the best score.
        // returns the best sore and stores it's in the double best
        double best = max(scores);

        // Assign and display grades methods
        display(scores, best);
    }
    //find the best score
    //it's double so there must be a double return statement
    public static double max(double[] scores) {
        //start with scores and index 0 as best score
        double best = scores[0];
        //loop through and compare the score with the best score
        //if score is greater than better than initialize best as the new score
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        //return the best score
        return best;
    }
    //display the best scores and assign grade
    //it's void so there is no return statements
    public static void display(double[] scores, double best) {
        //loop through each score to assign grade and display the appropriate output
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + i + " score is " + scores[i] + ", and their grade is ");
            //check if score at index i is equivalent to what grade
            if (scores[i] >= best - 10) {
                System.out.println("A.");
            } else if (scores[i] >= best - 20) {
                System.out.println("B.");
            } else if (scores[i] >= best - 30) {
                System.out.println("C.");
            } else if (scores[i] >= best - 40) {
                System.out.println("D.");
            } else {
                System.out.println("F.");
            }
        }
    }
}