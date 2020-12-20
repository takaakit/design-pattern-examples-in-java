package creationalpatterns.abstractfactory.factory;
// ˅

// ˄

public interface Factory {

    Page createPage(String title, String author);

    Link createLink(String name, String url);

    Data createData(String name);

    // ˅
    
    // ˄
}

// ˅

// ˄
