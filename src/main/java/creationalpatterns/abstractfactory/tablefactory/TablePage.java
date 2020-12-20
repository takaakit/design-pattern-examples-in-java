package creationalpatterns.abstractfactory.tablefactory;
// ˅
import creationalpatterns.abstractfactory.factory.Page;

// ˄

public class TablePage extends Page {
    // ˅
    
    // ˄

    public TablePage(String title, String author) {
        // ˅
        super(title, author);
        // ˄
    }

    @Override
    public String toHTML() {
        // ˅
    	StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title>").append(title).append("</title></head><body>\n");
        builder.append("<h1>").append(title).append("</h1>\n");
        builder.append("<table width=\"80%\" border=\"3\">\n");
        contents.forEach(content -> builder.append("<tr>").append(content.toHTML()).append("</tr>\n"));
        builder.append("</table>\n");
        builder.append("<hr><address>").append(author).append("</address>\n");
        builder.append("</body></html>\n");
        return builder.toString();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
