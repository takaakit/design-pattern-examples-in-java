package creationalpatterns.abstractfactory.listfactory;
// ˅
import creationalpatterns.abstractfactory.factory.Data;
import creationalpatterns.abstractfactory.factory.Factory;
import creationalpatterns.abstractfactory.factory.Link;
import creationalpatterns.abstractfactory.factory.Page;

// ˄

public class ListFactory implements Factory {
    // ˅
    
    // ˄

    @Override
    public Page createPage(String title, String author) {
        // ˅
        return new ListPage(title, author);
        // ˄
    }

    @Override
    public Link createLink(String name, String url) {
        // ˅
        return new ListLink(name, url);
        // ˄
    }

    @Override
    public Data createData(String name) {
        // ˅
        return new ListData(name);
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
