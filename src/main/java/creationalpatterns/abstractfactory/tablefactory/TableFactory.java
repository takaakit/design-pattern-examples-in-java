package creationalpatterns.abstractfactory.tablefactory;
// ˅
import creationalpatterns.abstractfactory.factory.Data;
import creationalpatterns.abstractfactory.factory.Factory;
import creationalpatterns.abstractfactory.factory.Link;
import creationalpatterns.abstractfactory.factory.Page;

// ˄

public class TableFactory implements Factory {
    // ˅
    
    // ˄

    @Override
    public Page createPage(String title, String author) {
        // ˅
        return new TablePage(title, author);
        // ˄
    }

    @Override
    public Link createLink(String name, String url) {
        // ˅
        return new TableLink(name, url);
        // ˄
    }

    @Override
    public Data createData(String name) {
        // ˅
        return new TableData(name);
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
