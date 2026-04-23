class HamperRunner{

    public static void main(String[] args) {

      
        Hamper hamper1 = new Hamper();
        

        hamper1.liftCover();
        hamper1.shutCover();
        hamper1.insertProducts();
        hamper1.takeOutProducts();
        hamper1.transportHamper();
        hamper1.wipeInterior();
        hamper1.rinseHamper();
        hamper1.airDry();
        hamper1.measureStorageSpace();
        hamper1.organizeContents();
        hamper1.secureWithSeal();
        hamper1.removeSeal();
        hamper1.customizeAppearance();
        hamper1.calculateWeight();
        hamper1.attachTag();

	Hamper hamper2 = new Hamper();
	
	
        hamper2.liftCover();
        hamper2.shutCover();
        hamper2.insertProducts();
        hamper2.takeOutProducts();
        hamper2.transportHamper();
        hamper2.wipeInterior();
        hamper2.rinseHamper();
        hamper2.airDry();
        hamper2.measureStorageSpace();
        hamper2.organizeContents();
        hamper2.secureWithSeal();
        hamper2.removeSeal();
        hamper2.customizeAppearance();
        hamper2.calculateWeight();
        hamper2.attachTag();

     
        Hamper.displayBrandName();
        Hamper.displayMaterialType();
        Hamper.displayCostDetails();
        Hamper.displayAvailableSizes();
        Hamper.displayCompanyInfo();
    }
}