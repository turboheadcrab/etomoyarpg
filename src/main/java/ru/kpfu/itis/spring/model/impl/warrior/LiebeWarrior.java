package ru.kpfu.itis.spring.model.impl.warrior;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.spring.model.Armor;
import ru.kpfu.itis.spring.model.Warrior;
import ru.kpfu.itis.spring.model.Weapon;

/**
 * Created by Apraxin Vladimir on 15.2.17.
 */

@Component
public class LiebeWarrior implements Warrior {

    private Armor armor;
    private Weapon weapon;

    public LiebeWarrior() {
    }

    @Autowired
    public LiebeWarrior(@Qualifier(value = "kevlar") Armor armor, @Qualifier(value = "AK47") Weapon weapon) {
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
