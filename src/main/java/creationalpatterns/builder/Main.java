package creationalpatterns.builder;

import creationalpatterns.abstractfactory.factory.Factory;
import structuralpatterns.adapter.Print;
import structuralpatterns.bridge.Display;
import structuralpatterns.bridge.MultiLineDisplay;

// Create documents in HTML format and text format.

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            showUsage();
        }
        else if (args[0].equals("plain")) {
            PlainTextBuilder plainTextBuilder = new PlainTextBuilder();
            Director director = new Director(plainTextBuilder);
            director.build();
            String content = plainTextBuilder.getResult();
            System.out.println(content);
        }
        else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.build();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + " has been created.");
        }
        else {
            showUsage();
        }
    }

    private static void showUsage() {
        System.out.println("Usage 1: java Main plain      <- Create a document in plain text.");
        System.out.println("Usage 2: java Main html       <- Create a document in HTML.");
    }
}
