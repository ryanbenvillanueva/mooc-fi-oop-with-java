
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner scanner = new Scanner(System.in);
        Database birdsObservation = new Database();

        while(true) {
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();
                birdsObservation.addBird(name, latinName);
            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("What was Observed:? ");
                String name = scanner.nextLine();
                birdsObservation.addObservation(name);
            } else if (command.equalsIgnoreCase("Statistics")) {
                birdsObservation.printAllBirds();
            } else if (command.equalsIgnoreCase("Show")) {
                System.out.print("What? ");
                String name = scanner.nextLine();
                birdsObservation.printBird(name);
            } else if (command.equalsIgnoreCase("Quit")) {
                break;
            }
        }
    }

}
