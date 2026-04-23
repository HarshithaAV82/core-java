class WallPaperRunner{
	
	public static void main(String[] args){
		
		WallPaper wallPaper1 = new WallPaper("Asian Paints","Beige","Floral","Vinyl",1599.50,0.53,10.0,0.2,"Matte",true,true,false,"Modern","Living Room","Smooth","India","Professional",5,120,"2 Years");
		wallPaper1.displayDetails();

		WallPaper wallPaper2 = new WallPaper(
			"Nerolac","White","Abstract","Paper",
			1299.00,0.50,9.5,0.3,"Glossy",
			false,false,true,"Classic","Bedroom",
			"Shiny","India","Self",
			4,80,"1 Year");
		wallPaper2.displayDetails();

		WallPaper wallPaper3 = new WallPaper(
			"Dulux","Grey","Striped","Fabric",
			1799.75,0.60,10.0,0.25,"Matte",
			true,false,false,"Contemporary","Hall",
			"Soft","UK","Professional",
			5,60,"3 Years");
		wallPaper3.displayDetails();


		WallPaper wallPaper4 = new WallPaper(
			"Marshalls","Blue","Geometric","Vinyl",
			1999.00,0.55,10.5,0.2,"Textured",
			true,true,false,"Modern","Office",
			"Smooth","USA","Professional",
			5,150,"5 Years");
		wallPaper4.displayDetails();


		WallPaper wallPaper5 = new WallPaper(
			"Excel","Cream","Nature","Paper",
			999.99,0.45,8.0,0.3,"Matte",
			false,false,true,"Eco","Kids Room",
			"Smooth","India","Self",
			3,200,"6 Months");
		wallPaper5.displayDetails();
		

		WallPaper wallPaper6 = new WallPaper(
			"Nilaya","Gold","Royal","Silk",
			2499.00,0.65,10.0,0.2,"Luxury",
			true,false,false,"Premium","Bedroom",
			"Glossy","India","Professional",
			5,40,"4 Years"
		);
		wallPaper6.displayDetails();

		WallPaper wallPaper7 = new WallPaper(
			"Vista","Pink","Floral","Vinyl",
			1399.00,0.50,9.0,0.2,"Matte",
			true,true,true,"Modern","Living Room",
			"Soft","Germany","Self",
			4,75,"2 Years");
		wallPaper7.displayDetails();

		WallPaper wallPaper8 = new WallPaper(
			"HomeStyle","Brown","Wooden","PVC",
			1899.00,0.60,10.0,0.3,"Textured",
			true,true,false,"Rustic","Hall",
			"Smooth","Italy","Professional",
			5,95,"3 Years");
		wallPaper8.displayDetails();

		WallPaper wallPaper9 = new WallPaper(
			"DecorX","Silver","Minimal","Vinyl",
			1699.00,0.52,10.0,0.2,"Glossy",
			true,false,true,"Minimalist","Office",
			"Shiny","France","Self",
			4,110,"2 Years");
		wallPaper9.displayDetails();

		WallPaper wallPaper10 = new WallPaper(
			"UrbanWall","Green","Leaf","Fabric",
			1499.00,0.58,9.8,0.25,"Matte",
			true,false,false,"Nature","Bedroom",
			"Soft","India","Professional",
			4,130,"2 Years");
		wallPaper10.displayDetails();
	}
}