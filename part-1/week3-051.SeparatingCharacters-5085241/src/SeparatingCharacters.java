
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        int number = 1;
        int i = 0;
        
        while (i < name.length()) {
            System.out.println(number + ". character: " + name.charAt(i));
            number++;
            i++;
        }
    }
}
