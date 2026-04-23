class PrinterRunner{
	
	public static void main(String[] args){
		
		String[] models = {"HP", "Canon", "Epson"};
		
		Ink[] inks = new Ink[3];
		inks[0] = new Ink("Black", 300);
		inks[1] = new Ink("Blue", 250);
		inks[2] = new Ink("yellow", 200);
		
		Printer printer = new Printer(models, inks);
		printer.display();
	}
}