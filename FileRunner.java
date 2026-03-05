class FileRunner{
	
	public static void main(String[] args){
		
		HTML html = new HTML("AnchorTags", 4);
		html.getFile();
		CSS css = new CSS();
		JavaScript javaScript = new JavaScript();
		Java java = new Java();
		CProgramming cProgramming = new CProgramming();
		
		
		File file = new File(23, html, css, javaScript, java, cProgramming);
		
	}
}