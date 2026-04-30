package com.xworkz.smart.inner;

public interface GameCharacter {

    String CHARACTER_TYPE = "Player";
    int HEALTH = 100;

    void attack();
    void defend();
    void specialMove();

}
