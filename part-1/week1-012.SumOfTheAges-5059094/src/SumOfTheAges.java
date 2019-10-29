
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String firstUserName = reader.nextLine();
        System.out.print("Type your age: ");
        int firstUserAge = Integer.parseInt(reader.nextLine());
        System.out.println("");
        
        System.out.print("Type your name: ");
        String secondUserName = reader.nextLine();
        System.out.print("Type your age: ");
        int secondUserAge = Integer.parseInt(reader.nextLine());
        System.out.println("");
        
        int sumOfTheAges = firstUserAge + secondUserAge;
        String toPrint = firstUserName + " and " + secondUserName + " are " + sumOfTheAges + " years old in total.";
        System.out.println(toPrint);
    }
}
