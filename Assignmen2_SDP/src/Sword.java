public class Sword implements Weapon {

    private final String name = "Excalibur";
    private final int damage = 100;

    @Override
    public void attack() {
        System.out.println("Sword attack!");
    }

    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getName() {
        return name;
    }
}