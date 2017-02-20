package ru.kpfu.itis.spring.model.impl.weapon;

import org.springframework.stereotype.Component;
import ru.kpfu.itis.spring.model.Weapon;

/**
 * Created by Apraxin Vladimir on 15.2.17.
 */

@Component
public class AK47 implements Weapon {

    private static final int fireDamage = 20;
    private static final int waterDamage = 0;
    private static final int airDamage = 0;
    private static final int earthDamage = 20;

    @Override
    public void describe(int fireDamage, int waterDamage, int airDamage, int earthDamage) {
        System.out.println("*****************************************");
        System.out.println("* Offense provided with help of AK-47");
        System.out.println("* Fire damage = " + fireDamage);
        System.out.println("* Water damage = " + waterDamage);
        System.out.println("* Air damage = " + airDamage);
        System.out.println("* Earth damage = " + earthDamage);
        System.out.println("*****************************************");
    }

    @Override
    public void attack(int multiplier) {
        System.out.println("PEW! PEW! Damage multiplied by " + multiplier);
    }

    @Override
    public int getFireDamage() {
        return fireDamage;
    }

    @Override
    public int getWaterDamage() {
        return waterDamage;
    }

    @Override
    public int getAirDamage() {
        return airDamage;
    }

    @Override
    public int getEarthDamage() {
        return earthDamage;
    }
}
