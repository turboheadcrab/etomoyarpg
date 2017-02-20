package ru.kpfu.itis.spring.model.impl.fight;

import ru.kpfu.itis.spring.model.Fight;
import ru.kpfu.itis.spring.model.Warrior;

import java.util.Random;

/**
 * Created by Apraxin Vladimir on 15.2.17.
 */
public class LiebeVsAmoreFight implements Fight {

    private Warrior warrior1;
    private Warrior warrior2;
    private PairOfDice dice;

    public LiebeVsAmoreFight() {
    }

    public LiebeVsAmoreFight(Warrior warrior1, Warrior warrior2) {
        this.warrior1 = warrior1;
        this.warrior2 = warrior2;
    }

    @Override
    public void start() {

        System.out.println("It has begun!");
        System.out.println("Player 1:");
        warrior1.describe();
        System.out.println("Player 2:");
        warrior2.describe();


    }

    public class PairOfDice {

        private int die1;
        private int die2;

        public PairOfDice() {
            roll();
        }

        public void roll() {
            Random random = new Random();
            die1 = random.nextInt(7);
            die2 = random.nextInt(7);
        }

        public int getDie1() {
            return die1;
        }

        public int getDie2() {
            return die2;
        }
    }

}
