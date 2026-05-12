package com.xworkz.programs.outer;

import com.xworkz.programs.inner.Remote;

public class Viewer {

    Remote remote;

    public Viewer(Remote remote) {
        this.remote = remote;
    }

    public void watch() {

        System.out.println("Viewer watching TV");

        if(remote != null) {

            remote.turnOn();

            System.out.println("Channel changed");

            remote.turnOff();
        }
    }
}