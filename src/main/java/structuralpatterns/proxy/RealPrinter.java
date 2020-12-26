package structuralpatterns.proxy;
// ˅

// ˄

public class RealPrinter implements Printer {
    // ˅
    
    // ˄

    private String printerName;

    public RealPrinter(String name) {
        // ˅
        this.printerName = name;
        heavyTask("Creating an instance(" + name + ") of the Printer");
        // ˄
    }

    public void setPrinterName(String value) {
        // ˅
        this.printerName = value;
        // ˄
    }

    // Display a content with the name
    @Override
    public void output(String content) {
        // ˅
        System.out.println("==========");
        System.out.println(content);
        System.out.println("Printed by " + printerName);
        System.out.println("==========");
        // ˄
    }

    // Heavy task (Please think so...)
    private void heavyTask(String message) {
        // ˅
        System.out.print(message);
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(-1);
            }
            System.out.print(".");
        }
        System.out.println("Done.");
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
