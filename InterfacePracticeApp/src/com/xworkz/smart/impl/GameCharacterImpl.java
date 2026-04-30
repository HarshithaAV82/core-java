package com.xworkz.smart.impl;

import com.xworkz.smart.inner.GameCharacter;

public class GameCharacterImpl implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("Character is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Character is defending");
    }

    @Override
    public void specialMove() {
        System.out.println("Character used special move");
    }
}
