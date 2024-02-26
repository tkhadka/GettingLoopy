/*
Pseudocode:
1. Initialize a counter at 0.
   Increment the counter by 1 on each iteration.
   Continue until the counter reaches 30.
   Display the counter value on each iteration.

2. Initialize a counter at 30.
   Decrement the counter by 1 on each iteration.
   Continue until the counter reaches 0.
   Display the counter value on each iteration.

3. Initialize a counter at 0.
   Increment the counter by 3 on each iteration.
   Continue until the counter reaches or exceeds 18.
   Display the counter value on each iteration.

4. Initialize a counter at 10.
   Decrement the counter by 2 on each iteration.
   Continue until the counter is less than 0.
   Display the counter value on each iteration.
*/

public class LoopCountExamples {
    public static void main(String[] args) {

        System.out.println("Beginning of Loop 1");
        // Loop 1: Count up by 1 from 0 to 30
        for (int counterOne = 0; counterOne <= 30; counterOne++) {
            System.out.println(counterOne);
        }

        System.out.println("Beginning of Loop 2");
        // Loop 2: Count down by 1 from 30 to 0
        for (int counterTwo = 30; counterTwo >= 0; counterTwo--) {
            System.out.println(counterTwo);
        }

        System.out.println("Beginning of Loop 3");
        // Loop 3: Count up by 3 from 0 to 18
        for (int counterThree = 0; counterThree <= 18; counterThree += 3) {
            System.out.println(counterThree);
        }

        System.out.println("Beginning of Loop 4");
        // Loop 4: Count down by 2 from 10 to 0
        for (int counterFour = 10; counterFour >= 0; counterFour -= 2) {
            System.out.println(counterFour);
        }
    }
}
