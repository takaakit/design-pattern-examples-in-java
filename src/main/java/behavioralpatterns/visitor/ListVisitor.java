package behavioralpatterns.visitor;
// ˅
import java.util.Iterator;

// ˄

public class ListVisitor implements Visitor {
    // ˅
    
    // ˄

    // Currently visited directory
    private String currentDirectory;

    public ListVisitor() {
        // ˅
        this.currentDirectory = "";
        
        // ˄
    }

    // Visit a file
    @Override
    public void visit(File file) {
        // ˅
        System.out.println(currentDirectory + "/" + file);
        // ˄
    }

    // Visit a directory
    @Override
    public void visit(Directory directory) {
        // ˅
        System.out.println(currentDirectory + "/" + directory);
        String visitedDirectory = currentDirectory;
        currentDirectory = currentDirectory + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            FileSystemElement element = (FileSystemElement)it.next();
            element.accept(this);
        }
        currentDirectory = visitedDirectory;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
