public class MageFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Staff();
    }
    @Override
    public Armor createArmor() {
        return new MagicRobe();
    }
}