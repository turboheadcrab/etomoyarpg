package ru.kpfu.itis.spring.model.impl.warrior;

import ru.kpfu.itis.spring.model.Armor;
import ru.kpfu.itis.spring.model.Warrior;
import ru.kpfu.itis.spring.model.Weapon;

/**
 * Created by Apraxin Vladimir on 14.2.17.
 */
public class AmoreWarrior implements Warrior {

    private Armor armor;
    private Weapon weapon;

    public AmoreWarrior() {
    }

    public AmoreWarrior(Armor armor, Weapon weapon) {
        this.armor = armor;
        this.weapon = weapon;
    }

    @Override
    public void describe() {
        System.out.println("This is warrior Amore!");
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
