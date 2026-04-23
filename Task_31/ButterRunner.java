class ButterRunner{

    public static void main(String[] args){

        DairyProduct dairyProduct = new DairyProduct();
        System.out.println(dairyProduct.brandName);
        System.out.println(dairyProduct.price);
        System.out.println(dairyProduct.packagingType);

		
        DairyProduct dairyProduct1 = new DairyProduct("Nandini");
        System.out.println(dairyProduct1.brandName);
        System.out.println(dairyProduct1.price);
        System.out.println(dairyProduct1.packagingType);

		
        DairyProduct dairyProduct2 = new DairyProduct("MilkyMist", 90.0, "Tub");
        System.out.println(dairyProduct2.brandName);
        System.out.println(dairyProduct2.price);
        System.out.println(dairyProduct2.packagingType);
    }
}