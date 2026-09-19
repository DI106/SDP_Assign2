public class Main {

    public static void main(String[] args) {

        EquipmentFactory warriorFactory = new WarriorFactory();
        showEquipment("WARRIOR", warriorFactory);

        EquipmentFactory mageFactory = new MageFactory();
        showEquipment("MAGE", mageFactory);
    }

    public static void showEquipment(String characterClass,
                                     EquipmentFactory factory) {

        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();

        System.out.println("=== " + characterClass + " EQUIPMENT ===");
        System.out.println("Weapon: " + weapon.getName());
        System.out.println("Damage: " + weapon.getDamage());
        System.out.println("Armor: " + armor.getName());
        System.out.println("Defense: " + armor.getDefense());

        System.out.println();

        weapon.attack();
        armor.protect();

        System.out.println();
    }
}