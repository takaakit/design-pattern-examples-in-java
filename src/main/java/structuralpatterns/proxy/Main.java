package structuralpatterns.proxy;

/*
Print on a named printer. Setting and changing the printer name is done by Proxy (ProxyPrinter).
At the time of printing, create an instance of the RealSubject (RealPrinter) for the first time.
 */

public class Main {
    public static void main(String[] args) {
        ProxyPrinter p = new ProxyPrinter("PRINTER-A");
        System.out.println("The printer name is " + p.getName() + ".");
        p.changeName("PRINTER-B");
        System.out.println("The printer name is " + p.getName() + ".");

        System.out.println("Print start.");
        p.output("Nice to meet you.");
        System.out.println("Print exit.");
    }
}
