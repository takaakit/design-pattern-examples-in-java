package creationalpatterns.prototype.framework;
// ˅
import java.util.*;
import java.text.*;

// ˄

public interface Display {

    Display createClone();

    void show(String message);

    // ˅
    
    // ˄
}

// ˅

// ˄
