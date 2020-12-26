package creationalpatterns.abstractfactory.listfactory;
// ˅
import creationalpatterns.abstractfactory.factory.Link;

// ˄

public class ListLink extends Link {
    // ˅
    
    // ˄

    public ListLink(String name, String url) {
        // ˅
        super(name, url);
        // ˄
    }

    @Override
    public String toHTML() {
        // ˅
        return "  <li><a href=\"" + url + "\">" + name + "</a></li>\n";
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
