
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        String smiley = ":)";
        int printLength = characterString.length() + 6;

        if (characterString.length() % 2 == 1) {
            printLength += 1;
        }

        for (int i = 0; i < printLength; i += 2) {
            System.out.print(":)");
        }
        System.out.println("");

        if (characterString.length() % 2 == 1) {
            System.out.println(":) " + characterString + "  :)");
        } else {
            System.out.println(":) " + characterString + " :)");
        }

        for (int i = 0; i < printLength; i += 2) {
            System.out.print(":)");
        }
        System.out.println("");
    }

}
