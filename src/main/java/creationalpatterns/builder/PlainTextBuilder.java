package creationalpatterns.builder;
// ˅

// ˄

public class PlainTextBuilder implements Builder {
    // ˅
    
    // ˄

    private final StringBuilder builder;

    public PlainTextBuilder() {
        // ˅
        this.builder = new StringBuilder();
        
        // ˄
    }

    // Make a title of plain text
    @Override
    public void createTitle(String title) {
        // ˅
        builder.append("--------------------------------\n");     // Decoration line
        builder.append("[").append(title).append("]\n");                             // Title
        builder.append("\n");                                     // Blank line
        // ˄
    }

    // Make a section of plain text
    @Override
    public void createSection(String section) {
        // ˅
        builder.append("* ").append(section).append("\n");                           // Section
        builder.append("\n");                                     // Blank line
        // ˄
    }

    // Make items of plain text
    @Override
    public void createItems(String[] items) {
        // ˅
        for (String item : items) {
            builder.append("  - ").append(item).append("\n");                  // Items
        }
        builder.append("\n");                                     // Blank line
        // ˄
    }

    @Override
    public void close() {
        // ˅
        builder.append("--------------------------------\n");     // Decoration line
        // ˄
    }

    // String to output
    public String getContent() {
        // ˅
        return builder.toString();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
