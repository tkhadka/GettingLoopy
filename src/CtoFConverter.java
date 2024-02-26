/*
Pseudocode:
1. Initialize scanner for user input.
2. Declare variables for Celsius input, Fahrenheit result, and input validity check.
3. Use a do-while loop to ensure the input is a valid double:
   a. Prompt the user to enter a temperature in Celsius.
   b. Check if the next input is a double, indicating a valid number.
   c. If valid, read the input, convert it to Fahrenheit, and display the result.
   d. If not valid, display an error message and prompt again.
4. Loop continues until a valid number is entered.
*/

import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        double tempCelsius;
        double tempFahrenheit;
        boolean isInputValid;

        do {
            System.out.print("Enter temperature in Celsius: ");
            isInputValid = scannerInput.hasNextDouble();

            if (isInputValid) {
                tempCelsius = scannerInput.nextDouble();
                tempFahrenheit = (tempCelsius * 9 / 5) + 32;
                System.out.println("Equivalent temperature in Fahrenheit: " + tempFahrenheit);
            } else {
                System.out.println("Invalid input, please enter a valid number.");
                scannerInput.next();
            }
        } while (!isInputValid);
    }
}
