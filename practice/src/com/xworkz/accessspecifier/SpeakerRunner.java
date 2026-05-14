package com.xworkz.accessspecifier;

import com.xworkz.accessspecifier.Speaker;

public class SpeakerRunner {

    public static void main(String[] args) {

        Speaker speaker = new Speaker();

        System.out.println(speaker.brand);
        speaker.playMusic();

        System.out.println(speaker.soundType);
        speaker.sound();

        System.out.println(speaker.color);
        speaker.displayColor();
    }
}