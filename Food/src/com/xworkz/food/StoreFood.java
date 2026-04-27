package com.xworkz.food;

public class StoreFood {

    Food[] foods;
    int currentIndex;

    public StoreFood(Food[] foods) {
        this.foods = foods;
    }

    void save(Food food) {
        if (this.foods != null && food != null) {
            if (currentIndex < foods.length) {
                foods[currentIndex] = food;
                System.out.println("Stored at index: " + currentIndex);
                food.info();
                currentIndex++;
            } else {
                System.out.println("Storage full");
            }
        }
    }

    void getAll() {
        if (this.foods != null) {
            for (Food food : foods) {
                if (food != null) {
                    food.info();
                    System.out.println("------");
                }
            }
        }
    }
}