package creationalpatterns.builder;

import java.io.File;
import java.util.Scanner;

/*
Create documents in HTML format and text format. It is possible to create different documents
in the same construction process.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter \"plain\" or \"html\":");
        Scanner scan = new Scanner(System.in);
        String inputValue = scan.next();

        if (inputValue.equals("plain")) {
            PlainTextBuilder plainTextBuilder = new PlainTextBuilder();
            Director director = new Director(plainTextBuilder);
            director.build();
            String content = plainTextBuilder.getContent();
            System.out.println(content);
        }
        else if (inputValue.equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.build();
            String fileName = htmlBuilder.getFileName();
            System.out.println(fileName + " has been created.");
            System.out.println("Output File: " + new File(new File(".").getAbsoluteFile().getParent(), fileName).getPath());
        }
        else {
            System.err.println("The value is not \"plain\" or \"html\".");
            System.exit(-1);
        }
    }
}
