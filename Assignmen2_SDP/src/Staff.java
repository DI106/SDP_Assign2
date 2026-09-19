public class Staff implements Weapon {

    private final String name = "Stormy";
    private final int damage = 55;

    @Override
    public void attack() {
        System.out.println("Casting a spell!");
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getDamage() {
        return damage;
    }
}