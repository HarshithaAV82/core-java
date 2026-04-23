class StorePastaRunner{

    public static void main(String[] args){

        String[] pastas = new String[5];

        StorePasta storePasta = new StorePasta(pastas);

        storePasta.getPastaName("Macaroni");
        storePasta.getPastaName("Penne");
        storePasta.getPastaName("Spaghetti");

        System.out.println("\nSearch Found:");
        boolean found = storePasta.searchPastaName("Macaroni");
        System.out.println("Result: " + found);

        System.out.println("\nSearch Not Found:");
        boolean notFound = storePasta.searchPastaName("ShellPasta");
        System.out.println("Result: " + notFound);

        System.out.println("\nUpdate:");
        storePasta.update(1, "Fusilli");
        storePasta.update("Ravioli", "Spaghetti");

        System.out.println("\nDelete:");
        storePasta.delete(0);
        storePasta.delete("Fusilli");
    }
}