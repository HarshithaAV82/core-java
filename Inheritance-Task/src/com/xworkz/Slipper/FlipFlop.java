package com.xworkz.Slipper;

public class FlipFlop extends Slipper{
        String strapType;
        boolean archSupport;

        public FlipFlop(boolean isWaterproof, double price, String[] colors, SlipperBrand brand, Material material, String strapType, boolean archSupport){
            super(isWaterproof, price, colors, brand, material);
            this.strapType = strapType;
            this.archSupport = archSupport;
        }

        @Override
        public String toString() {
            return super.toString() + ", Strap Type:" + strapType + ", Arch Support:" + archSupport;
        }
    }
