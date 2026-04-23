class PowerBankRunner{

    public static void main(String[] args){

        OfficePowerBank officePowerBank = new OfficePowerBank();
        System.out.println(officePowerBank.brandName);
        System.out.println(officePowerBank.price);
        System.out.println(officePowerBank.color);
        System.out.println(officePowerBank.numberOfPorts);
        System.out.println(officePowerBank.fastCharging);
        System.out.println(officePowerBank.wirelessCharging);
        System.out.println(officePowerBank.displayType);
        System.out.println(officePowerBank.isPortable);
        officePowerBank.charge();
        officePowerBank.stopCharge();
        officePowerBank.displayDetails();

        OfficePowerBank officePowerBank1 = new OfficePowerBank();
        System.out.println(officePowerBank1.brandName);
        System.out.println(officePowerBank1.price);
        System.out.println(officePowerBank1.color);
        System.out.println(officePowerBank1.numberOfPorts);
        System.out.println(officePowerBank1.fastCharging);
        System.out.println(officePowerBank1.wirelessCharging);
        System.out.println(officePowerBank1.displayType);
        System.out.println(officePowerBank1.isPortable);
        officePowerBank1.charge();
        officePowerBank1.stopCharge();
        officePowerBank1.displayDetails();

        
        PowerBank powerBank = new OfficePowerBank();
        System.out.println(powerBank.brandName);
        System.out.println(powerBank.price);
        System.out.println(powerBank.color);
        powerBank.charge();
        powerBank.stopCharge();

        PowerBank powerBank1 = new OfficePowerBank();
        System.out.println(powerBank1.brandName);
        System.out.println(powerBank1.price);
        System.out.println(powerBank1.color);
        powerBank1.charge();
        powerBank1.stopCharge();

        PowerBank electric = new PowerBank();
        System.out.println(electric.brandName);
        System.out.println(electric.price);
        System.out.println(electric.color);
        electric.charge();
        electric.stopCharge();

        PowerBank electric1 = new PowerBank();
        System.out.println(electric1.brandName);
        System.out.println(electric1.price);
        System.out.println(electric1.color);
        electric1.charge();
        electric1.stopCharge();
    }
}