package ru.kpfu.itis.spring.model.impl.warrior;

import ru.kpfu.itis.spring.model.Armor;
import ru.kpfu.itis.spring.model.Warrior;
import ru.kpfu.itis.spring.model.Weapon;

/**
 * Created by Apraxin Vladimir on 15.2.17.
 */
public class LiebeWarrior implements Warrior {

    private Armor armor;
    private Weapon weapon;

    public LiebeWarrior() {
    }

    public LiebeWarrior(Armor armor, Weapon weapon) {
        this.armor = armor;
        this.weapon = weapon;
    }

    @Override
    public void describe() {
        System.out.println("This is warrior Liebe!");
        armor.describe(armor.getFireResistance(), armor.getWaterResistance(), armor.getAirResistance(),
                armor.getEarthResistance());
        weapon.describe(weapon.getFireDamage(), weapon.getWaterDamage(), weapon.getAirDamage(),
                weapon.getEarthDamage());
    }

    @Override
    public Armor getArmor() {
        return armor;
    }

    @Override
    public Weapon getWeapon() {
        return weapon;
    }
}
