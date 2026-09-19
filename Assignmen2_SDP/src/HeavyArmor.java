public class HeavyArmor implements Armor {

    private final String name = "Spectre Armor";
    private final int defense = 70 ;

    @Override
    public void protect() {
        System.out.println("Heavy armor protects the warrior!");
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getDefense() {
        return defense;
    }
}