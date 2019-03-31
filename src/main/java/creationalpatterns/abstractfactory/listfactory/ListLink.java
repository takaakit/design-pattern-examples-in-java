package creationalpatterns.abstractfactory.listfactory;
// ˅
import java.util.*;
import java.text.*;
import creationalpatterns.abstractfactory.factory.Link;

// ˄

public class ListLink extends Link {
    // ˅
    
    // ˄

    ListLink(String name, String url) {
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
