package example.adapter.pattern;

public class Main {
    public static void main(String[] args) {
        RoyalKnight royalKnight = new RoyalKnight();
        AwkwardArcher awkwardArcher = new AwkwardArcher();
        UnitAdapter adapter = new UnitAdapter(royalKnight);

        royalKnight.swordAttack();
        royalKnight.knifeAttack();

        awkwardArcher.arrowAttack();
        awkwardArcher.ineptKnifeAttack();

        adapter.ineptKnifeAttack();
    }
}