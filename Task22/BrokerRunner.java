class BrokerRunner{

    public static void main(String[] args){

        String[] customers = new String[3];
        customers[0] = "Arjun";
        customers[1] = "Vijay";
        customers[2] = "Rahul";

        Contract[] contracts = new Contract[3];
        contracts[0] = new Contract("Land Deal", 800000);
        contracts[1] = new Contract("House Deal", 1200000);
        contracts[2] = new Contract("Shop Deal", 600000);

        Broker broker = new Broker(customers, contracts);
        broker.display();
    }
}