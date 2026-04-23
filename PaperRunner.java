class PaperRunner{

    public static void main(String[] args) {

        Paper paper1 = new Paper("JK Copier","A4","Wood Pulp","White", 75.0,29.7,21.0,500,299.50,false,false,true,
     "Smooth","Matte","Office Printing","JK Paper Ltd","India","Ream Pack",250,"FSC Certified");
        paper1.list();

        Paper paper2 = new Paper("Classmate","A4","Wood Pulp","White",80.0,29.7,21.0,400, 320.00,false,false,true,"Smooth","Matte","School Use",
                "ITC","India","Packet",  180,"ISO Certified");
        paper2.list();

        Paper paper3 = new Paper("Navneet","A3","Recycled","Off White",70.0,42.0,29.7,300, 450.00,true,false,true,"Rough","Matte","Drawing",
                "Navneet Ltd","India","Pack",150,"FSC Certified");
        paper3.list();

        Paper paper4 = new Paper("TNPL","A4","Wood Pulp","White",75.0,29.7,21.0,500,280.00,false,false,true,
                "Smooth","Matte","Office Printing", "TNPL","India","Ream Pack", 300,"ISO Certified");
        paper4.list();

        Paper paper5 = new Paper("PaperOne","A4","Wood Pulp","Bright White",80.0,29.7,21.0,500,350.00,false,false,true,
                "Smooth","Glossy","Professional Printing","APRIL Group","Indonesia","Box",200,"FSC Certified");
        paper5.list();

        Paper paper6 = new Paper("Double A","A4","Wood Pulp","White", 80.0,29.7,21.0,500, 370.00,false,false,true,
               "Smooth","Matte","Office Printing","Double A Co.","Thailand","Box",220,"ISO Certified");
        paper6.list();

        Paper paper7 = new Paper("Oddy","A4","Recycled","White",75.0,29.7,21.0,500,260.00,true,false,true,
                "Smooth","Matte","General Use","Oddy India","India","Packet",140,"FSC Certified");
        paper7.list();

        Paper paper8 = new Paper("Century","A4","Wood Pulp","White",70.0,29.7,21.0,400, 240.00,false,false,false,"Normal","Matte","Copying",
         "Century Pulp","India","Ream", 190,"ISO Certified");
        paper8.list();

        Paper paper9 = new Paper("BILT","A4","Wood Pulp","White",75.0,29.7,21.0,500,
             300.00,false,false,true, "Smooth","Matte","Office Use", "BILT","India","Ream Pack", 210,"FSC Certified");
        paper9.list();

        Paper paper10 = new Paper("Sundaram","A4","Recycled","Cream", 72.0,29.7,21.0,450,275.00,true,false,true,
                "Slight Rough","Matte","School Use", "Sundaram Ltd","India","Pack", 160,"ISO Certified");
        paper10.list();
    }
}