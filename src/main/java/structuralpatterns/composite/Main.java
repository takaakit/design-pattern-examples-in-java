package structuralpatterns.composite;

/*
Represents a file system composed of files and directories. FileSystemElement makes
it possible to treat File and Directory uniformly.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Create a file system...");

        Directory binDir = new Directory("bin");
        File lsFile = new File("ls", 20);
        binDir.add(lsFile);
        File mkdirFile = new File("mkdir", 40);
        binDir.add(mkdirFile);

        Directory emilyDir = new Directory("emily");
        File homeworkFile = new File("homework.doc", 60);
        emilyDir.add(homeworkFile);

        Directory jamesDir = new Directory("james");
        File appFile = new File("app.exe", 80);
        jamesDir.add(appFile);

        Directory homeDir = new Directory("home");
        homeDir.add(emilyDir);
        homeDir.add(jamesDir);

        Directory rootDir = new Directory("root");
        rootDir.add(homeDir);
        rootDir.add(binDir);

        rootDir.print("");
    }
}
