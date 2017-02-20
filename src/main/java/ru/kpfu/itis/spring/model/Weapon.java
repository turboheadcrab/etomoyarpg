package ru.kpfu.itis.spring.model;

/**
 * Created by Apraxin Vladimir on 14.2.17.
 */
public interface Weapon {

    void describe(int fireDamage, int waterDamage, int airDamage, int earthDamage);

    void attack(int multiplier);

    int getFireDamage();

    int getWaterDamage();

    int getAirDamage();

    int getEarthDamage();
}
