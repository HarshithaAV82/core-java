package com.xworkz.programs;

import com.xworkz.programs.impl.*;
import com.xworkz.programs.inner.*;
import com.xworkz.programs.outer.*;

public class Runner {

    public static void main(String[] args) {

        SuperMarket superMarket = new RelianceStore();
        Supplier supplier = new Supplier(superMarket);
        supplier.supply();

        OperatingSystem operatingSystem = new LinuxOS();
        LenovoLaptop laptop = new LenovoLaptop(operatingSystem);
        laptop.runSystem();
        
        Hospital hospital = new ApolloHospital();
        Surgeon surgeon = new Surgeon(hospital);
        surgeon.treatPatient();
        
        Bluetooth bluetooth = new BoatBluetooth();
        MobileDevice device = new MobileDevice(bluetooth);
        device.shareFiles();

        Remote remote = new SonyRemote();
        Viewer viewer = new Viewer(remote);
        viewer.watch();
        
        MenuCard menuCard = new RestaurantMenu();
        RestaurantKitchen kitchen = new RestaurantKitchen(menuCard);
        kitchen.serveFood();
    }
}