package creationalpatterns.abstractfactory.tablefactory;
// ˅
import java.util.*;
import java.text.*;
import creationalpatterns.abstractfactory.factory.Link;

// ˄

public class TableLink extends Link {
    // ˅
    
    // ˄

    TableLink(String name, String url) {
        // ˅
        super(name, url);
        // ˄
    }

    @Override
    public String toHTML() {
        // ˅
        return "  <td><a href=\"" + url + "\">" + name + "</a></td>\n";
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
