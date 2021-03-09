package behavioralpatterns.chainofresponsibility;

/*
A trouble is turned around among supporters, and the trouble will be handled by the supporter who can handle it.
There are four types of supporters below:
* LazySupporter doesn't handle any trouble
* MoodySupporter handles odd ID troubles
* SpecialSupporter handles a trouble of the target ID.
* LimitedSupporter handles troubles below the limit ID.
 */

public class Main {
    public static void main(String[] args) {
        Supporter emily = new LazySupporter("Emily");
        Supporter william = new MoodySupporter("William");
        Supporter amelia = new SpecialSupporter("Amelia", 6);
        Supporter joseph = new LimitedSupporter("Joseph", 5);

        // Make a chain.
        emily.setNext(william).setNext(amelia).setNext(joseph);

        // Various troubles occurred.
        for (int i = 0; i < 10; i++) {
            emily.support(new Trouble(i));
        }
    }
}
