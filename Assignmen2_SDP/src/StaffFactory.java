public class StaffFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Staff();
    }
}