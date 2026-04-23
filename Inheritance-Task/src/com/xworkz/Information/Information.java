package com.xworkz.Information;
import java.util.Arrays;

    public class Information {
        String topic;
        int pages;
        String[] points;
        InfoSource source;
        InfoType type;

        public Information(String topic, int pages, String[] points, InfoSource source, InfoType type) {
            this.topic = topic;
            this.pages = pages;
            this.points = points;
            this.source = source;
            this.type = type;
        }

        public void read() {
            System.out.println("Firstly Reading the information...");
        }
        public void save() {
            System.out.println("Saving the important information.....");
        }

        public String toString() {
            return topic + ", " + pages + ", " + Arrays.toString(points) + ", " + source + ", " + type;
        }
    }

