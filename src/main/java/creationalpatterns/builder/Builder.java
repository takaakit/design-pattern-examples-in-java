package creationalpatterns.builder;
// ˅

// ˄

public interface Builder {

    void createTitle(String title);

    void createSection(String section);

    void createItems(String[] items);

    void close();

    // ˅
    
    // ˄
}

// ˅

// ˄
