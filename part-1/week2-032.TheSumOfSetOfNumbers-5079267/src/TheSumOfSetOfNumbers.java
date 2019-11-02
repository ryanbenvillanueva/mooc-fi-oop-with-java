
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int n = 1;
        while (n <= number) {
            sum += n;
            n++;
        }
        System.out.println("Sum is " + sum);

    }
}
