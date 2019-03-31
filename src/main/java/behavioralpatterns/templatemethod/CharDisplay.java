package behavioralpatterns.templatemethod;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class CharDisplay extends AbstractDisplay {
    // ˅
    
    // ˄

    private final char charValue;

    CharDisplay(char charValue) {
        // ˅
        this.charValue = charValue;
        
        // ˄
    }

    @Override
    public void open() {
        // ˅
        System.out.print("<<");         // Display "<<" in the start characters.
        // ˄
    }

    @Override
    public void write() {
        // ˅
        System.out.print(charValue);         // Display the character.
        // ˄
    }

    @Override
    public void close() {
        // ˅
        System.out.println(">>");       // Display ">>" in the end characters.
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
