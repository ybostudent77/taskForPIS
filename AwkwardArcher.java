package example.adapter.pattern;

public class AwkwardArcher implements Archer {
    @Override
    public void ineptKnifeAttack() {
        System.out.println("The awkward knife attack!");
    }

    public void arrowAttack() {
        System.out.println("The perfect arrow attack!");
    }
}
