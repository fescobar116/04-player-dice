package edu.unac.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Player {
    private int minToWin;
    private Dice dice;

    public boolean play(){
        int diceValue = dice.roll();
        System.out.println("dice value: " + diceValue);
        return diceValue >= minToWin;
    }
}
