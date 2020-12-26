package creationalpatterns.builder;
// ˅
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// ˄

public class HTMLBuilder implements Builder {
    // ˅
    
    // ˄

    // File name to create
    private String fileName;

    private PrintWriter writer;

    public HTMLBuilder() {
        // ˅
        this.fileName = null;
        this.writer = null;
        
        // ˄
    }

    // Make a title of HTML file
    @Override
    public void createTitle(String title) {
        // ˅
        fileName = title + ".html";                     // Set a title as a file name
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");  // Write a title
        writer.println("<h1>" + title + "</h1>");
        // ˄
    }

    // Make a section of HTML file
    @Override
    public void createSection(String section) {
        // ˅
        writer.println("<p>" + section + "</p>");        // Write a section
        // ˄
    }

    // Make items of HTML file
    @Override
    public void createItems(String[] items) {
        // ˅
        writer.println("<ul>");                  // Write items
        for (String item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
        // ˄
    }

    @Override
    public void close() {
        // ˅
        writer.println("</body></html>");
        writer.close();                         // Close file
        // ˄
    }

    public String getFileName() {
        // ˅
        return fileName;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
