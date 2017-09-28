import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);
        int recHeight;
        int recLength;
        int recArea;

            System.out.println("Find area of a rectangle:");
            System.out.println("Enter height of rectangle");
            recHeight = scnr.nextInt();
            System.out.println("Enter base of rectangle");
            recLength = scnr.nextInt();

                recArea = (recLength) * (recHeight);

            System.out.println("The area of the rectangle is " + recArea + '.');

    }
}