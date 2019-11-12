
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            
            Student studentInfo = new Student(name, studentNumber);
            list.add(studentInfo);
        }
        
        for (Student studentInfo : list) {
            System.out.println(studentInfo.toString());
        }
        
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        
        for (Student studentInfo : list) {
            if (studentInfo.getName().contains(searchTerm)) {
                System.out.println(studentInfo.toString());
            }
        }
    }
}
