package structuralpatterns.proxy;

// At the time of printing, create an instance of the printer for the first time.
// In order to spend time creating a printer, call a heavy task when creating a printer instance.

public class Main {
    public static void main(String[] args) {
        PrinterProxy p = new PrinterProxy("PRINTER-A");
        System.out.println("The current printer is " + p.getPrinterName() + ".");
        p.setPrinterName("PRINTER-B");
        System.out.println("The current printer is " + p.getPrinterName() + ".");
        p.output("Nice to meet you.");
    }
}
