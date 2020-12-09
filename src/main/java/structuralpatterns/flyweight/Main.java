package structuralpatterns.flyweight;

/*
Display a string consisting of large characters. Large character objects are not created until they are needed. And the created objects are reused.
 */

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main digits");
            System.out.println("Ex.  : java Main 1212123");
        }
        else {
            LargeSizeString bs = new LargeSizeString(args[0]);
            bs.display();
        }
    }
}
