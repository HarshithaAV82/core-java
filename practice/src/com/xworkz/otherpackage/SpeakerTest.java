package com.xworkz.otherpackage;
import com.xworkz.accessspecifier.Speaker;

public class SpeakerTest {

    public static void main(String[] args) {

        Speaker speaker = new Speaker();

        System.out.println(speaker.brand);
        speaker.playMusic();

    }
}