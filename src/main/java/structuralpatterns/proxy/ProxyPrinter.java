package structuralpatterns.proxy;
// ˅

// ˄

// ProxyPrinter forwards requests to RealPrinter when appropriate.
public class ProxyPrinter implements Printer {
    // ˅

    // ˄

    private String currentName;

    // A printer that actually prints
    private RealPrinter real;

    public ProxyPrinter(String name) {
        // ˅
        this.currentName = name;
        this.real = null;

        // ˄
    }

    @Override
    public String getName() {
        // ˅
        if (real != null) {
            return real.getName();
        }
        else {
            return currentName;
        }
        // ˄
    }

    @Override
    public void changeName(String name) {
        // ˅
        if (real != null) {
            real.changeName(name);
        }

        this.currentName = name;
        // ˄
    }

    @Override
    public void output(String content) {
        // ˅
        // Check to see if the the RealPrinter had been created, create it if necessary.
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
