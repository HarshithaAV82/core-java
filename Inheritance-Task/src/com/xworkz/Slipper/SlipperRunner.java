package com.xworkz.Slipper;

public class SlipperRunner{
        public static void main(String[] args) {

            System.out.println("Execute the  variables and methods");
            SlipperBrand brandName = new SlipperBrand("Bata", "India");
            String[] colors = {"Blue", "Black", "White"};
            Slipper slipper = new Slipper(true, 500.0, colors, brandName, Material.RUBBER);
            slipper.slipperInfo();
            slipper.materialInfo();
            slipper.toString();
            System.out.println(slipper.toString());

            System.out.println("Execute the Child class flip flop Info");
            FlipFlop flipFlop = new FlipFlop(true, 1200.0, colors, brandName, Material.LEATHER, "Y-Shape", true);
            flipFlop.slipperInfo();
            flipFlop.materialInfo();
            System.out.println(flipFlop.toString());
        }
    }

