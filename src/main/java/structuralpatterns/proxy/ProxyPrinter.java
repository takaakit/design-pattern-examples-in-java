package structuralpatterns.proxy;
// ˅

// ˄

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
        return currentName;
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
