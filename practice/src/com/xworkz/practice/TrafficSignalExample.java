package com.xworkz.practice;


    public class TrafficSignalExample {
        public static void main(String[] args) {
            Signal signal = Signal.GREEN;
            System.out.println("Current Signal:" + signal);
            switch (signal){
                case RED:
                    System.out.println("stop");
                    break;

                case YELLOW:
                    System.out.println("get ready");
                    break;

                case GREEN:
                    System.out.println("GO");
                    break;
            }
            System.out.println("null signals:");

            for (Signal value:Signal.values()){
                System.out.println(value);
            }
        }
    }
