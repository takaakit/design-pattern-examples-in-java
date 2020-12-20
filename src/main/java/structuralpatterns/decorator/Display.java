package structuralpatterns.decorator;
// ˅

// ˄

public abstract class Display {
    // ˅
    
    // ˄

    public abstract String getLineText(int row);

    // Column width
    public abstract int getColumns();

    // Number of rows
    public abstract int getRows();

    // Show all
    public void show() {
        // ˅
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getLineText(i));
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
