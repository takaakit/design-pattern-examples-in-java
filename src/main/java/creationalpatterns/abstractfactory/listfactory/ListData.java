package creationalpatterns.abstractfactory.listfactory;
// ˅
import creationalpatterns.abstractfactory.factory.Data;

// ˄

public class ListData extends Data {
    // ˅

    // ˄

    public ListData(String name) {
        // ˅
        super(name);
        // ˄
    }

    @Override
    public String toHTML() {
        // ˅
    	StringBuilder builder = new StringBuilder();
        builder.append("<li>").append(name).append("<ul>\n");
        items.forEach(item -> builder.append(item.toHTML()));
        builder.append("</ul></li>\n");
        return builder.toString();
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
