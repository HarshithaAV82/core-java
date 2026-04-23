class CellRunner{

    public static void main(String[] args) {

        Cell cell1 = new Cell("Neuron","Transmit Signals","Star","Complex",
            "Eukaryotic","Lipid","Fluid","Human","Mitosis","Glucose", 0.01,70,85,20,46,500,25,true,false,true);
        cell1.showCellInfo();

        Cell cell2 = new Cell("Red Blood Cell","Carry Oxygen","Round","Simple",
            "None","Flexible","Fluid","Human","Mitosis","Hemoglobin",0.008,120,80,25,46,0,30,true,false,true);
        cell2.showCellInfo();

        Cell cell3 = new Cell("Muscle Cell","Movement","Long","Striped",
            "Eukaryotic","Strong","Dense","Human","Mitosis","ATP",0.02,90,88,22,46,300,28,true,true,true);
        cell3.showCellInfo();

        Cell cell4 = new Cell("Skin Cell","Protection","Flat","Layered",
            "Eukaryotic","Tough","Thick","Human","Mitosis","Glucose",0.015,60,70,18,46,200,35,true,true,true);
        cell4.showCellInfo();

        Cell cell5 = new Cell("Plant Cell","Photosynthesis","Rectangular","Rigid",
            "Eukaryotic","Cellulose","Green","Plant","Mitosis","Sunlight",0.03,100,75,15,24,400,20,true,true,true);
        cell5.showCellInfo();

        Cell cell6 = new Cell("Bacteria","Infection","Oval","Simple",
            "Prokaryotic","Thin","Gel","Bacteria","Binary Fission","Glucose",0.005,10,65,10,1,50,5,true,true,false);
        cell6.showCellInfo();

        Cell cell7 = new Cell("White Blood Cell","Immunity","Irregular","Flexible",
            "Eukaryotic","Elastic","Fluid","Human","Mitosis","Glucose",0.012,40,82,23,46,250,32,true,true,true);
        cell7.showCellInfo();

        Cell cell8 = new Cell("Fat Cell","Store Energy","Round","Soft",
            "Eukaryotic","Flexible","Fatty","Human","Mitosis","Lipids",0.025,80,60,12,46,150,45,true,false,true);
        cell8.showCellInfo();

        Cell cell9 = new Cell("Stem Cell","Regeneration","Round","Undifferentiated",
            "Eukaryotic","Flexible","Fluid","Human","Mitosis","Glucose",0.018,120,90,20,46,350,18,true,true,true);
        cell9.showCellInfo();

        Cell cell10 = new Cell("Cancer Cell","Abnormal Growth","Irregular","Mutated",
            "Eukaryotic","Weak","Fluid","Human","Uncontrolled","Glucose",0.02,50,95,30,46,400,40,true,true,false);
        cell10.showCellInfo();
    }
}