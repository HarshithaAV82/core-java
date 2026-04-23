class PainterRunner{
	
	
	public static void main(String[] args){
		String[] painterNames = new String[3];
		painterNames[0] = "Basvaraj";
		painterNames[1] = "raj";
		painterNames[2] = "varun";
		
		PaintColor[] paintcolors = new PaintColor[3];
		paintcolors[0] = new PaintColor("Purple", 100);
		paintcolors[1] = new PaintColor("yellow", 400);
		paintcolors[2] = new PaintColor("Pink", 500);
		
		Painter painter = new Painter(painterNames, paintcolors);
		painter.display();
	
	}
}