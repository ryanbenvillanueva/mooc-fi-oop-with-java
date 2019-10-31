
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the temperature today: ");
            double temperature = Double.parseDouble(reader.nextLine());
            if (!(temperature < -30 || temperature > 40)){
                Graph.addNumber(temperature);
            }
        }
    }
}
