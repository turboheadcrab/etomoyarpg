package ru.kpfu.itis.spring.model.impl.fight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.spring.model.Fight;
import ru.kpfu.itis.spring.model.PairOfDice;
import ru.kpfu.itis.spring.model.Warrior;

/**
 * Created by Apraxin Vladimir on 15.2.17.
 */

@Component
public class LiebeVsAmoreFight implements Fight {

    private Warrior warrior1;
    private Warrior warrior2;
    private PairOfDice dice;

    public LiebeVsAmoreFight() {
    }

    @Autowired
    public LiebeVsAmoreFight(@Qualifier(value = "liebeWarrior") Warrior warrior1,
                             @Qualifier(value = "amoreWarrior") Warrior warrior2, PairOfDice dice) {
        this.warrior1 = warrior1;
        this.warrior2 = warrior2;
        this.dice = dice;
    }

    @Override
    public void start() {

        System.out.println("It has begun!");
        System.out.println("Player 1:");
        warrior1.describe();
        System.out.println("Player 2:");
        warrior2.describe();
        System.out.println("FIGHT!");

        int p1HP = 1000, p2HP = 1000, turnCount = 1;
        do {
            System.out.println("Turn " + turnCount);

            if (turnCount % 2 == 1) {
                System.out.println("Liebe attacks! Amore defends!");
                p2HP = turn(p2HP, warrior1, warrior2);
            } else {
                System.out.println("Amore attacks! Liebe defends!");
                p1HP = turn(p1HP, warrior2, warrior1);
            }

            turnCount++;
        } while ((p1HP > 0) && (p2HP > 0));
    }

    private int turn(int defendingHP, Warrior attackingPlayer, Warrior defendingPlayer) {

        dice.roll();
        attackingPlayer.getWeapon().attack(dice.getDie1());
        defendingPlayer.getArmor().defend(dice.getDie2());

        defendingHP = damageCalculator(defendingHP, attackingPlayer.getWeapon().getFireDamage(),
                defendingPlayer.getArmor().getFireResistance(), dice.getDie1(), dice.getDie2());
        System.out.println(defendingHP + " HP left after fire battle");
        defendingHP = damageCalculator(defendingHP, attackingPlayer.getWeapon().getWaterDamage(),
                defendingPlayer.getArmor().getWaterResistance(), dice.getDie1(), dice.getDie2());
        System.out.println(defendingHP + " HP left after water battle");
        defendingHP = damageCalculator(defendingHP, attackingPlayer.getWeapon().getAirDamage(),
                defendingPlayer.getArmor().getAirResistance(), dice.getDie1(), dice.getDie2());
        System.out.println(defendingHP + " HP left after air battle");
        defendingHP = damageCalculator(defendingHP, attackingPlayer.getWeapon().getEarthDamage(),
                defendingPlayer.getArmor().getEarthResistance(), dice.getDie1(), dice.getDie2());
        System.out.println(defendingHP + " HP left after earth battle");

        return defendingHP;
    }

    private int damageCalculator(int hp, int damage, int resistance, int multiplierDamage, int multiplierResistance) {

        int delta = 0;
        delta += damage * multiplierDamage;
        System.out.println("Current damage is " + delta);
        delta -= resistance * multiplierResistance;
        System.out.println("Current damage is " + delta);
        if (delta > 0) {
            hp -= delta;
        }
        return hp;
    }
}
