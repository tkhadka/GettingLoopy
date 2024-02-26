/*
Pseudocode:
For Pattern 5 (Increasing stars):
1. Use an outer loop to iterate 5 times for each line.
2. Within the outer loop, use an inner loop to print "*" as many times as the current line number.
3. Print a newline character after each iteration of the outer loop to start a new line.

For Pattern 6 (Decreasing stars):
1. Use an outer loop to iterate from 5 to 1 for each line.
2. Within the outer loop, use an inner loop to print "*" as many times as the current line number in reverse.
3. Print a newline character after each iteration of the outer loop to start a new line.

For Pattern 7 (Uniform stars):
1. Use an outer loop to iterate 5 times for each line.
2. Within the outer loop, use an inner loop to print "*" exactly 5 times for each line.
3. Print a newline character after each iteration of the outer loop to start a new line.
*/

public class PatternGenerator {
    public static void main(String[] args) {

        System.out.println("Start of Pattern 5: Increasing Stars");
        // Pattern 5: Increasing Stars
        for (int rowOne = 1; rowOne <= 5; rowOne++) {
            for (int colOne = 1; colOne <= rowOne; colOne++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        System.out.println("Start of Pattern 6: Decreasing Stars");
        // Pattern 6: Decreasing Stars
        for (int rowTwo = 5; rowTwo >= 1; rowTwo--) {
            for (int colTwo = 1; colTwo <= rowTwo; colTwo++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        System.out.println("Start of Pattern 7: Uniform Stars");
        // Pattern 7: Uniform Stars
        for (int rowThree = 1; rowThree <= 5; rowThree++) {
            for (int colThree = 1; colThree <= 5; colThree++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
