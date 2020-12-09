package structuralpatterns.adapter;

/*
Display the given string as follows
```
-- Nice to meet you --
```
or display it as follows.
```
[[ Nice to meet you ]]
```
 */

public class Main {
    public static void main(String[] args) {
        Print p = new PrintMessageDisplay("Nice to meet you");
        p.printWeak();
        p.printStrong();
    }
}
