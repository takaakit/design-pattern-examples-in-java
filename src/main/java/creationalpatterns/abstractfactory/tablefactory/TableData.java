package creationalpatterns.abstractfactory.tablefactory;
// ˅
import creationalpatterns.abstractfactory.factory.Data;

// ˄

public class TableData extends Data {
    // ˅
    
    // ˄

    public TableData(String name) {
        // ˅
        super(name);
        // ˄
    }

    @Override
    public String toHTML() {
        // ˅
    	StringBuilder builder = new StringBuilder();
        builder.append("<td><table width=\"100%\" border=\"2\">\n");
        builder.append("<tr><td bgcolor=\"#00CC00\" align=\"center\" colspan=\"").append(items.size()).append("\"><b>").append(name).append("</b></td></tr>\n");
        builder.append("<tr>\n");
        items.forEach(item -> builder.append(item.toHTML()));
        builder.append("</tr>\n");
        builder.append("</table></td>\n");
        return builder.toString();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
