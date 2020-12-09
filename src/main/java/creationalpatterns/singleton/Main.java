package creationalpatterns.singleton;

/*
Check whether the same instance is obtained.
 */

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 are the same instance.");
        }
        else {
            System.out.println("obj1 and obj2 are different instances.");
        }
    }
}
