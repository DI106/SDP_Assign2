public class MagicRobe implements Armor {

    private final String name = "Dark Artist Armor";
    private final int defense = 90;

    @Override
    public void protect() {
        System.out.println("Magic robe protects the mage!");
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