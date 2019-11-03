
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type numbers ");
        int number = 0;
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;
        double average = 0.0;
        
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            
            if (number == -1) {
                break;
            } else {
                sum += number;
                count++;
                average = (double)sum / count;
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
