package structuralpatterns.proxy;
// ˅

// ˄

public class RealPrinter implements Printer {
    // ˅
    
    // ˄

    private String name;

    public RealPrinter(String name) {
        // ˅
        this.name = name;
        heavyTask("Creating an instance (" + name + ") of the Printer");
        // ˄
    }

    public String getName() {
        // ˅
        return name;
        // ˄
    }

    public void changeName(String name) {
        // ˅
        this.name = name;
        // ˄
    }

    // Display a content with the name
    @Override
    public void output(String content) {
        // ˅
        System.out.println("==========");
        System.out.println(content);
        System.out.println("Printed by " + name);
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
