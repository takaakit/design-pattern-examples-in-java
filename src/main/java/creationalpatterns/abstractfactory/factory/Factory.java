package creationalpatterns.abstractfactory.factory;
// ˅
import java.util.*;
import java.text.*;

// ˄

public interface Factory {

    Page createPage(String title, String author);

    Link createLink(String name, String url);

    Data createData(String name);

    static Factory getFactory(String classname) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // ˅
        return (Factory)Class.forName(classname).newInstance();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
