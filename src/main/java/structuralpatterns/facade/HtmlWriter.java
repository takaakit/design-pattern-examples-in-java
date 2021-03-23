package structuralpatterns.facade;
// ˅
import java.io.IOException;
import java.io.Writer;

// ˄

public class HtmlWriter {
    // ˅
    
    // ˄

    private final Writer writer;

    public HtmlWriter(Writer writer) {
        // ˅
        this.writer = writer;
        
        // ˄
    }

    // Write a title
    public void heading(String title) throws IOException {
        // ˅
        writer.write("<html>");
        writer.write("<head><title>" + title + "</title></head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
        // ˄
    }

    // Write a paragraph
    public void paragraph(String message) throws IOException {
        // ˅
        writer.write("<p>" + message + "</p>\n");
        // ˄
    }

    // Write a mail address
    public void mailto(String mailAddress, String userName) throws IOException {
        // ˅
        anchor("mailto:" + mailAddress, userName);
        // ˄
    }

    public void close() throws IOException {
        // ˅
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
        // ˄
    }

    // Write a link
    private void anchor(String url, String text) throws IOException {
        // ˅
        paragraph("<a href=\"" + url + "\">" + text + "</a>");
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
