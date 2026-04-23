class StoreCylinderRunner {

    public static void main(String[] args) {

        String[] cylinders = new String[5];

        StoreCylinder storeCylinder = new StoreCylinder(cylinders);

        storeCylinder.getCylinderName("HP");
        storeCylinder.getCylinderName("Indane");
        storeCylinder.getCylinderName("BharatGas");

        System.out.println("\nSearch Found:");
        boolean found = storeCylinder.searchCylinderName("HP");
        System.out.println("Result: " + found);

        System.out.println("\nSearch Not Found:");
        boolean notFound = storeCylinder.searchCylinderName("ShellGas");
        System.out.println("Result: " + notFound);

        System.out.println("\nUpdate:");
        storeCylinder.update(1, "SuperGas");
        storeCylinder.update("RelianceGas", "BharatGas");

        System.out.println("\nDelete:");
        storeCylinder.delete(0);
        storeCylinder.delete("SuperGas");
    }
}