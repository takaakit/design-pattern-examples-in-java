package behavioralpatterns.chainofresponsibility;

//Someone handles a trouble.

public class Main {
    public static void main(String[] args) {
        Supporter emily = new LazySupporter("Emily");
        Supporter william = new MoodySupporter("William");
        Supporter amelia = new SpecialSupporter("Amelia", 153);
        Supporter michael = new SpecialSupporter("Michael", 340);
        Supporter joseph = new LimitedSupporter("Joseph", 250);
        Supporter lily = new LimitedSupporter("Lily", 350);

        // Make a chain.
        emily.setNext(william).setNext(amelia).setNext(michael).setNext(joseph).setNext(lily);

        // Various troubles occurred.
        for (int i = 0; i < 500; i += 17) {
            emily.support(new Trouble(i));
        }
    }
}
