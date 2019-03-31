package behavioralpatterns.visitor;

// Visitors visit a file system composed of files and directories, and displays a list of files/directories.

public class Main {
    public static void main(String[] args) {
        System.out.println("Create a file system...");
        Directory rootDir = new Directory("root");
        Directory homeDir = new Directory("home");
        Directory binDir = new Directory("bin");
        Directory etcDir = new Directory("etc");
        Directory emilyDir = new Directory("emily");
        Directory jamesDir = new Directory("james");
        Directory oliviaDir = new Directory("olivia");

        rootDir.add(homeDir);
        rootDir.add(binDir);
        rootDir.add(etcDir);

        binDir.add(new File("ls", 100));
        binDir.add(new File("mkdir", 50));
        homeDir.add(emilyDir);
        homeDir.add(jamesDir);
        homeDir.add(oliviaDir);

        emilyDir.add(new File("homework.doc", 40));
        jamesDir.add(new File("homework.doc", 50));
        jamesDir.add(new File("app.exe", 60));
        oliviaDir.add(new File("homework.doc", 70));
        oliviaDir.add(new File("app.exe", 80));
        oliviaDir.add(new File("tips.html", 90));

        rootDir.accept(new ListVisitor());
    }
}
