package structuralpatterns.facade;
// ˅
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

// ˄

public class PageCreator {
    // ˅
    
    // ˄

    private static final PageCreator instance = new PageCreator();

    public static PageCreator getInstance() {
        // ˅
        return instance;
        // ˄
    }

    private PageCreator() {
        // ˅
        
        // ˄
    }

    public void createSimpleHomepage(String mailAddress, String htmlFileName) {
        // ˅
        Properties addressBook = DataLibrary.getInstance().getProperties("src/main/java/structuralpatterns/facade/addressbook.txt");
        String userName = addressBook.getProperty(mailAddress);
        
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(htmlFileName));
            writer.heading(userName + "'s homepage");
            writer.paragraph("Welcome to " + userName + "'s homepage.");
            writer.paragraph("Please email me at this address.");
            writer.mailto(mailAddress, userName);
            writer.close();
            System.out.println(htmlFileName + " is created for " + mailAddress + " (" + userName + ")");
            System.out.println("Output File: " + new File(new File(".").getAbsoluteFile().getParent(), htmlFileName).getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
