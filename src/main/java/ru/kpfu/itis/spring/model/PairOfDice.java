package ru.kpfu.itis.spring.model;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Apraxin Vladimir on 21.2.17.
 */

@Component
public class PairOfDice {
    private int die1;
    private int die2;

    public PairOfDice() {
        roll();
    }

    public void roll() {
        Random random = new Random();
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }
}
