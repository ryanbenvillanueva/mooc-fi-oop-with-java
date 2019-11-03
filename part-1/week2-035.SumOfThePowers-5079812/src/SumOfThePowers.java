
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int power = 0;
        int number = 2;
        
        while (power <= n) {
            sum += (int)Math.pow(number, power);
            power++;
        }
        
        System.out.println("The result is " + sum);
    }
}
