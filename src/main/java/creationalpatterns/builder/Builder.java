package creationalpatterns.builder;
// ˅
import java.util.*;
import java.text.*;

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
