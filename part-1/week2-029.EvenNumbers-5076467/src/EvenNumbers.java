
public class EvenNumbers {

    public static void main(String[] args) {
        int evenNumbers = 2;

        while (evenNumbers <= 100 && (evenNumbers % 2 == 0)) {
            System.out.println(evenNumbers);
            evenNumbers += 2;
        }
    }
}
