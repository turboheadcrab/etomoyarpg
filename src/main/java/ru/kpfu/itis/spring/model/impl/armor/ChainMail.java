package ru.kpfu.itis.spring.model.impl.armor;

import org.springframework.stereotype.Component;
import ru.kpfu.itis.spring.model.Armor;

/**
 * Created by Apraxin Vladimir on 15.2.17.
 */

@Component
public class ChainMail implements Armor {

    private static final int fireResistance = 0;
    private static final int waterResistance = 0;
    private static final int airResistance = 10;
    private static final int earthResistance = 30;

    @Override
    public void describe(int fireResistance, int waterResistance, int airResistance, int earthResistance) {
        System.out.println("--------------------------------------------------");
        System.out.println("Protection by Chain Mail with following properties:");
        System.out.println("Fire resistance = " + fireResistance);
        System.out.println("Water resistance = " + waterResistance);
        System.out.println("Air resistance = " + airResistance);
        System.out.println("Earth resistance = " + earthResistance);
        System.out.println("--------------------------------------------------");
    }

    @Override
    public void defend(int multiplier) {
        System.out.println("CLANK! " + multiplier + "x protection granted!");
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
