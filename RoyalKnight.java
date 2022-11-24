package example.adapter.pattern;

public class RoyalKnight implements Knight{

    @Override
    public void swordAttack() {
        System.out.println("The perfect sword attack!");
    }

    @Override
    public void knifeAttack() {
        System.out.println("The perfect knife attack!");
    }
}
