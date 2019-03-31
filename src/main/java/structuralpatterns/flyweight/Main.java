package structuralpatterns.flyweight;

// First, create instances for displaying large size characters, then display large size character string using that instances.

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
