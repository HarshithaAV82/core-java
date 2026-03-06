class File{
	
	int size = 23;
	int count = 5;
	String FileType = "text";
	boolean store = true;
	int copy = 6;
	
	int noOfFiles;
	HTML html;
	CSS css;
	JavaScript javaScript;
	Java java;
	CProgramming cProgramming;
	
	File(int noOfFiles, HTML html, CSS css, JavaScript javaScript, 
	Java java, CProgramming cProgramming){
		
		this.noOfFiles=noOfFiles;
		this.html=html;
		this.css=css;
		this.javaScript=javaScript;
		this.java=java;
		this.cProgramming=cProgramming;
		
		System.out.println("created File with noOfFiles html css javaScript java cProgramming using const");
		
	}
	
}