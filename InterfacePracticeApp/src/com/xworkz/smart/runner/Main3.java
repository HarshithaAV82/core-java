package com.xworkz.smart.runner;

import com.xworkz.smart.impl.GameCharacterImpl;
import com.xworkz.smart.inner.GameCharacter;

public class Main3 {

    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacterImpl();

        gameCharacter.attack();
        gameCharacter.defend();
        gameCharacter.specialMove();

        System.out.println(GameCharacter.CHARACTER_TYPE);
        System.out.println(GameCharacter.HEALTH);
    }
}
