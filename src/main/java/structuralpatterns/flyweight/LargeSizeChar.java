package structuralpatterns.flyweight;
// ˅
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// ˄

public class LargeSizeChar {
    // ˅
    
    // ˄

    // Display data of the large size character
    private String displayData;

    public LargeSizeChar(char charName) {
        // ˅
        this.displayData = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/structuralpatterns/flyweight/big" + charName + ".txt"));
            String line;
            StringBuilder buf = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            displayData = buf.toString();
        }
        catch (IOException e) {
            displayData = charName + "?";
        }
        
        // ˄
    }

    // Display the large size character
    public void display() {
        // ˅
        System.out.println(displayData);
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
