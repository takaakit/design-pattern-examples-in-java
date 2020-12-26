package structuralpatterns.proxy;
// ˅

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

    public String getPrinterName() {
        // ˅
        return currentName;
        // ˄
    }

    public void setPrinterName(String value) {
        // ˅
        if (real != null) {
            real.setPrinterName(value);
        }
        this.currentName = value;
        // ˄
    }

    @Override
    public void output(String content) {
        // ˅
        if (real == null) {
            real = new RealPrinter(currentName);
        }
        real.output(content);
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
