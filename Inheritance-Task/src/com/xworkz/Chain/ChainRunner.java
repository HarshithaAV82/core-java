package com.xworkz.Chain;

public class ChainRunner{
        public static void main(String[] args) {
            ChainBrand brand = new ChainBrand("24Kart", "India");
            String[] styles = {"Simple", "Daily"};
            Chain chain = new Chain("Gold", 20, styles, brand, ChainType.GOLD);
            System.out.println("Harshitha is using chain desgin...");
            chain.wear();
            chain.remove();
            System.out.println(chain);
            ChainDetails details = new ChainDetails("Silver", 18, styles, brand, ChainType.SILVER, true, 5000);
            System.out.println("Harshitha is using the chaindetails");
            details.wear();
            details.remove();
            System.out.println(details);
        }

}
