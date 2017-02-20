package ru.kpfu.itis.spring.model.impl.weapon;

import ru.kpfu.itis.spring.model.Weapon;

/**
 * Created by Apraxin Vladimir on 15.2.17.
 */
public class Excalibur implements Weapon {

    private static final int fireDamage = 10;
    private static final int waterDamage = 10;
    private static final int airDamage = 10;
    private static final int earthDamage = 10;

    @Override
    public void describe(int fireDamage, int waterDamage, int airDamage, int earthDamage) {
        System.out.println("*****************************************");
        System.out.println("* Offense provided with help of Excalibur");
        System.out.println("* Fire damage = " + fireDamage);
        System.out.println("* Water damage = " + waterDamage);
        System.out.println("* Air damage = " + airDamage);
        System.out.println("* 1Earth damage = " + earthDamage);
        System.out.println("*****************************************");
    }

    @Override
    public void attack(int multiplier) {
        System.out.println("WHACK-CK-CK!! Your hit is " + multiplier + " times as powerful!");
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
