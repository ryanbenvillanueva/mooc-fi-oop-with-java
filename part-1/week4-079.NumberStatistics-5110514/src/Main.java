
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics sumOfAllGiven = new NumberStatistics();
        NumberStatistics sumOfAllEven = new NumberStatistics();
        NumberStatistics sumOfAllOdd = new NumberStatistics();

        System.out.println("Type numbers:");

        while (true) {
            int number = Integer.parseInt(reader.nextLine());

            if (number == -1) {
                break;
            }

            sumOfAllGiven.addNumber(number);
            
            if (number % 2 == 0) {
                sumOfAllEven.addNumber(number);
            } else {
                sumOfAllOdd.addNumber(number);
            }
        }

        System.out.println("sum: " + sumOfAllGiven.sum());
        System.out.println("sum of even: " + sumOfAllEven.sum());
        System.out.println("sum of odd: " + sumOfAllOdd.sum());
    }
}
