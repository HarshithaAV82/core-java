package com.xworkz.otherpackage;
import com.xworkz.accessspecifier.Speaker;

public class BluetoothSpeaker extends Speaker {

    public static void main(String[] args) {

        BluetoothSpeaker bluetooth = new BluetoothSpeaker();

        System.out.println(bluetooth.brand);
        bluetooth.playMusic();

        System.out.println(bluetooth.soundType);
        bluetooth.sound();

    }
}