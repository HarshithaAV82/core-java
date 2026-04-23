class CarrierRunner{

    public static void main(String[] args){

        
        DiseaseCarrier diseaseCarrier = new DiseaseCarrier();
        System.out.println(diseaseCarrier.personName);
        System.out.println(diseaseCarrier.age);
        System.out.println(diseaseCarrier.diseaseName);
        System.out.println(diseaseCarrier.hasSymptoms);
        System.out.println(diseaseCarrier.contagious);
        System.out.println(diseaseCarrier.carrierType);
        System.out.println(diseaseCarrier.daysInfected);
        System.out.println(diseaseCarrier.recovered);
        diseaseCarrier.spreadDisease();
        diseaseCarrier.checkHealth();
        diseaseCarrier.displayDetails();

        DiseaseCarrier diseaseCarrier1 = new DiseaseCarrier();
        System.out.println(diseaseCarrier1.personName);
        System.out.println(diseaseCarrier1.age);
        System.out.println(diseaseCarrier1.diseaseName);
        System.out.println(diseaseCarrier1.hasSymptoms);
        System.out.println(diseaseCarrier1.contagious);
        System.out.println(diseaseCarrier1.carrierType);
        System.out.println(diseaseCarrier1.daysInfected);
        System.out.println(diseaseCarrier1.recovered);
        diseaseCarrier1.spreadDisease();
        diseaseCarrier1.checkHealth();
        diseaseCarrier1.displayDetails();

        Carrier carrier = new DiseaseCarrier();
        System.out.println(carrier.personName);
        System.out.println(carrier.age);
        System.out.println(carrier.diseaseName);
        carrier.spreadDisease();
        carrier.checkHealth();

        Carrier carrier1 = new DiseaseCarrier();
        System.out.println(carrier1.personName);
        System.out.println(carrier1.age);
        System.out.println(carrier1.diseaseName);
        carrier1.spreadDisease();
        carrier1.checkHealth();

        Carrier disease = new Carrier();
        System.out.println(disease.personName);
        System.out.println(disease.age);
        System.out.println(disease.diseaseName);
        disease.spreadDisease();
        disease.checkHealth();

        Carrier disease1 = new Carrier();
        System.out.println(disease1.personName);
        System.out.println(disease1.age);
        System.out.println(disease1.diseaseName);
        disease1.spreadDisease();
        disease1.checkHealth();
    }
}