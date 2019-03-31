package structuralpatterns.proxy;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class PrinterProxy implements Printer {
    // ˅

    // ˄

    private String currentName;

    // A printer that actually prints
    private RealPrinter real;

    public PrinterProxy(String name) {
        // ˅
        this.currentName = name;
        this.real = null;

        // ˄
    }

    String getPrinterName() {
        // ˅
        return currentName;
        // ˄
    }

    void setPrinterName(String value) {
        // ˅
        if (real != null) {
            real.printerName = value;
        }
        this.currentName = value;
        // ˄
    }

    @Override
    public void output(String content) {
        // ˅
        createPrinter();
        real.output(content);
        // ˄
    }

    // Create an actual printer
    private void createPrinter() {
        // ˅
        if (real == null) {
            real = new RealPrinter(currentName);
        }
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
