public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
         while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int s = 1;
        while(size > 0) {
            printWhitespaces(size - 1);
            printStars(s);
            s++;
            size--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int stand = 2;
        int h = 1;
        int s = height;
        while (h <= height) {
            printWhitespaces(s - 1);
            printStars(2 * h - 1);
            h++;
            s--;
        }
        while (stand > 0) {
            printWhitespaces(height-2);
            printStars(3);
            stand--;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
