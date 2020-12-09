package structuralpatterns.proxy;

/*
Print on a named printer. Setting and changing the printer name is done by Proxy("PrinterProxy"). At the time of printing, create an instance of the RealSubject("RealPrinter") for the first time.
 */

public class Main {
    public static void main(String[] args) {
        PrinterProxy p = new PrinterProxy("PRINTER-A");
        System.out.println("The current printer is " + p.getPrinterName() + ".");
        p.setPrinterName("PRINTER-B");
        System.out.println("The current printer is " + p.getPrinterName() + ".");
        p.output("Nice to meet you.");
    }
}
