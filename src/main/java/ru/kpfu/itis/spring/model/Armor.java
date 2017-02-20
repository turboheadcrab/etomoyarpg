package ru.kpfu.itis.spring.model;

/**
 * Created by Apraxin Vladimir on 14.2.17.
 */
public interface Armor {

    void describe(int fireResistance, int waterResistance, int airResistance, int earthResistance);

    void defend(int multiplier);

    int getFireResistance();

    int getWaterResistance();

    int getAirResistance();

    int getEarthResistance();
}
