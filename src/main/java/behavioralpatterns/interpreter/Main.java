package behavioralpatterns.interpreter;

import java.io.BufferedReader;
import java.io.FileReader;

/*
Parse the following syntax composed of "forward", "left", "right", and "repeat" commands:

<program>      ::= program <command list>
<command list> ::= <command>* end
<command>      ::= <repeat> | <action>
<repeat>       ::= repeat <number> <command list>
<action>       ::= forward | right | left
<number>       ::= 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9

-----
Examples before and after syntax analysis.
* Ex.1
Before : "program end"
After  : [program []]

* Ex.2
Before : "program forward right left end"
After  : [program [forward, right, left]]

* Ex.3
Before : "program repeat 4 forward right end end"
After  : [program [repeat 4 [forward, right]]]
*/

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/behavioralPatterns/interpreter/program.txt"))) {
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new Program();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
