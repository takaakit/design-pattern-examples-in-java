package structuralpatterns.facade;
// ˅
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// ˄

public class DataLibrary {
    // ˅
    
    // ˄

    private static final DataLibrary instance = new DataLibrary();

    public static DataLibrary getInstance() {
        // ˅
        return instance;
        // ˄
    }

    private DataLibrary() {
        // ˅
        
        // ˄
    }

    // Read a data library file.
    Properties getProperties(String dataLibraryFileName) {
        // ˅
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(dataLibraryFileName));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return prop;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
