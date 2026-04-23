class OrganRunner{

    public static void main(String[] args){

        Organ organ1 = new Organ("Heart","Pump Blood","Circulatory","Chest",
            "Red","Muscle","Rib Cage","Cone","Cardiac","Coronary",
            300,12.0,95.0,20.0,5000000,30,5,true,true,false);
        organ1.displayInfo();

        Organ organ2 = new Organ("Lung","Breathing","Respiratory","Chest",
            "Pink","Spongy","Rib Cage","Lobed","Alveoli","Pulmonary",
            1000,25.0,90.0,30.0,8000000,28,6,true,true,true);
        organ2.displayInfo();

        Organ organ3 = new Organ("Liver","Detox","Digestive","Abdomen",
            "Brown","Soft","Rib Cage","Irregular","Hepatic","Hepatic Artery",
            1500,20.0,92.0,18.0,7000000,35,7,true,true,true);
        organ3.displayInfo();

        Organ organ4 = new Organ("Kidney","Filter Blood","Excretory","Lower Back",
            "Red","Bean","Fat","Oval","Nephron","Renal",
            150,10.0,88.0,15.0,4000000,40,4,true,true,true);
        organ4.displayInfo();

        Organ organ5 = new Organ("Brain","Control Body","Nervous","Head",
            "Gray","Neural","Skull","Folded","Cortex","Cerebral",
            1400,15.0,98.0,25.0,860000000,25,10,true,true,false);
        organ5.displayInfo();

        Organ organ6 = new Organ("Stomach","Digest Food","Digestive","Abdomen",
            "Pink","Muscle","Skin","J-Shaped","Gastric","Arteries",
            500,18.0,85.0,16.0,3000000,32,6,false,true,true);
        organ6.displayInfo();

        Organ organ7 = new Organ("Pancreas","Produce Insulin","Digestive","Abdomen",
            "Yellow","Soft","Abdomen","Flat","Gland","Pancreatic",
            120,8.0,87.0,14.0,2000000,38,5,false,true,true);
        organ7.displayInfo();

        Organ organ8 = new Organ("Spleen","Filter Blood","Immune","Left Abdomen",
            "Purple","Soft","Rib","Oval","Lymphatic","Splenic",
            180,9.0,84.0,12.0,2500000,45,3,false,true,false);
        organ8.displayInfo();

        Organ organ9 = new Organ("Intestine","Absorb Nutrients","Digestive","Abdomen",
            "Pink","Tube","Abdomen","Long","Villi","Mesenteric",
            2000,30.0,89.0,22.0,9000000,29,8,false,true,false);
        organ9.displayInfo();

        Organ organ10 = new Organ("Skin","Protect Body","Integumentary","Outer Body",
            "Brown","Layered","Self","Flat","Epidermis","Capillaries",
            4000,50.0,93.0,10.0,10000000,27,9,false,true,true);
        organ10.displayInfo();
    }
}