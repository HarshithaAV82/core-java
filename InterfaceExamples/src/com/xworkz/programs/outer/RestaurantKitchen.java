package com.xworkz.programs.outer;

import com.xworkz.programs.inner.MenuCard;

public class RestaurantKitchen {

    MenuCard menuCard;

    public RestaurantKitchen(MenuCard menuCard) {
        this.menuCard = menuCard;
    }

    public void serveFood() {

        System.out.println("Preparing food");

        if(menuCard != null) {

            menuCard.getItems(5, "Harshitha");

            System.out.println("Food served");
        }
    }
}