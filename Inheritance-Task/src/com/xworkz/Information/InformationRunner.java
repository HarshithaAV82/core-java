package com.xworkz.Information;
public class InformationRunner{
        public static void main(String[] args) {

            InfoSource source = new InfoSource("Book", "Library");
            String[] points = {"Java", "HTML", "CSS"};
            Information info = new Information("Programming", 100, points, source, InfoType.BASIC);
            info.read();
            info.save();
            System.out.println(info);
            InfoDetails details = new InfoDetails("Advanced Programming", 200, points, source, InfoType.FULL, true, 5);
            details.read();
            details.save();
            System.out.println(details);
        }
    }

