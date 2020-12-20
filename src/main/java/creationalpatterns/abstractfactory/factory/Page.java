package creationalpatterns.abstractfactory.factory;
// ˅
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// ˄

public abstract class Page {
    // ˅
    
    // ˄

    protected final String title;

    protected final String author;

    protected List<Item> contents;

    public Page(String title, String author) {
        // ˅
        this.title = title;
        this.author = author;
        this.contents = new ArrayList<>();
        
        // ˄
    }

    public abstract String toHTML();

    public void add(Item item) {
        // ˅
        contents.add(item);
        // ˄
    }

    public void output() {
        // ˅
        String fileName = title + ".html";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(this.toHTML());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fileName + " has been created.");
        System.out.println("Output File: " + new File(new File(".").getAbsoluteFile().getParent(), fileName).getPath());
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
