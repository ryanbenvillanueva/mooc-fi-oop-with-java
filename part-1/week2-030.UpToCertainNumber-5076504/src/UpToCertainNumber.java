
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int lowerLimit = 1;
        System.out.print("Up to what number? ");
        int upperLimit = Integer.parseInt(reader.nextLine());
       
        while (lowerLimit <= upperLimit) {
            System.out.println(lowerLimit);
            lowerLimit++;
        }
        
    }
}
