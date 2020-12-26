package creationalpatterns.builder;
// ˅

// ˄

public class Director {
    // ˅

    // ˄

    private final Builder builder;

    public Director(Builder builder) {
        // ˅
        this.builder = builder;

        // ˄
    }

    // Construct a document
    public void build() {
        // ˅
        builder.createTitle("Greeting");                                                // Title
        builder.createSection("Morning and Afternoon");                                 // Section
        builder.createItems(new String[]{"Good morning.", "Hello."});                   // Items
        builder.createSection("Evening");                                               // Other section
        builder.createItems(new String[]{"Good evening.", "Good night.", "Goodbye."});  // Other items
        builder.close();
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
