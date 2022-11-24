package example.adapter.pattern;

public class UnitAdapter implements Archer {
    Knight knight;

    public UnitAdapter(Knight knight) {
        this.knight = knight;
    }

    @Override
    public void ineptKnifeAttack() {
        knight.knifeAttack();
    }
}