package structuralpatterns.flyweight;

/*
Display a string consisting of large characters. Large character objects are not created until they are needed. And the created objects are reused.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter digits (ex. 1212123):");
        Scanner scan = new Scanner(System.in);
        String inputValue = scan.next();

        LargeSizeString lss = new LargeSizeString(inputValue);
        lss.display();
    }
}
