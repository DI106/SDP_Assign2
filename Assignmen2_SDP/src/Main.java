public class Main {

    public static void main(String[] args) {

        // Warrior equipment
        EquipmentFactory warriorFactory = new WarriorFactory();

        Weapon warriorWeapon = warriorFactory.createWeapon();
        Armor warriorArmor = warriorFactory.createArmor();

        warriorWeapon.attack();
        warriorArmor.protect();


        System.out.println();


        // Mage equipment
        EquipmentFactory mageFactory = new MageFactory();

        Weapon mageWeapon = mageFactory.createWeapon();
        Armor mageArmor = mageFactory.createArmor();

        mageWeapon.attack();
        mageArmor.protect();
    }
}