package creationalpatterns.abstractfactory.listfactory;
// ˅
import creationalpatterns.abstractfactory.factory.Page;

// ˄

public class ListPage extends Page {
    // ˅
    
    // ˄

    public ListPage(String title, String author) {
        // ˅
        super(title, author);
        // ˄
    }

    @Override
    public String toHTML() {
        // ˅
    	StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title>").append(title).append("</title></head>\n");
        builder.append("<body><h1>").append(title).append("</h1>\n");
        builder.append("<ul>\n");
        contents.forEach(content -> builder.append(content.toHTML()));
        builder.append("</ul>\n");
        builder.append("<hr><address>").append(author).append("</address>");
        builder.append("</body></html>\n");
        return builder.toString();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
