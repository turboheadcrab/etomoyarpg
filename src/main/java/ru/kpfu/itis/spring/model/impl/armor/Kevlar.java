package ru.kpfu.itis.spring.model.impl.armor;

import org.springframework.stereotype.Component;
import ru.kpfu.itis.spring.model.Armor;

/**
 * Created by Apraxin Vladimir on 15.2.17.
 */

@Component
public class Kevlar implements Armor {

    private static final int fireResistance = 5;
    private static final int waterResistance = 10;
    private static final int airResistance = 15;
    private static final int earthResistance = 10;

    @Override
    public void describe(int fireResistance, int waterResistance, int airResistance, int earthResistance) {
        System.out.println("--------------------------------------------------");
        System.out.println("Protection by Kevlar with following properties:");
        System.out.println("Fire resistance = " + fireResistance);
        System.out.println("Water resistance = " + waterResistance);
        System.out.println("Air resistance = " + airResistance);
        System.out.println("Earth resistance = " + earthResistance);
        System.out.println("--------------------------------------------------");
    }

    @Override
    public void defend(int multiplier) {
        System.out.println("Z-Z-Zip! You're " + multiplier + " times more protected");
    }

    @Override
    public int getFireResistance() {
        return fireResistance;
    }

    @Override
    public int getWaterResistance() {
        return waterResistance;
    }

    @Override
    public int getAirResistance() {
        return airResistance;
    }

    @Override
    public int getEarthResistance() {
        return earthResistance;
    }
}
