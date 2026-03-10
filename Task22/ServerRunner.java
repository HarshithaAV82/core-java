class ServerRunner{

    public static void main(String[] args){

        String[] systems = new String[3];
        systems[0] = "IBM";
        systems[1] = "Cisco";
        systems[2] = "Oracle";

        Power[] powers = new Power[3];
        powers[0] = new Power("SMPS", 500);
        powers[1] = new Power("UPS", 1000);
        powers[2] = new Power("Battery", 750);

        Server server = new Server(systems, powers);
        server.display();
    }
}