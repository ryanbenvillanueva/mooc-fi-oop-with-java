
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        int biggerNumber = Math.max(firstNumber, secondNumber);
        String toPrint = "The bigger number of the two numbers given was: " + biggerNumber;
        System.out.println(toPrint);
    }
}
