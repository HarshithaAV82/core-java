class Broker{

    String[] customers;
    Contract[] contracts;

    Broker(String[] customers, Contract[] contracts){
        this.customers = customers;
        this.contracts = contracts;
    }

    void display(){

        System.out.println("Broker Details");

        if(this.customers != null){
            System.out.println("Total Customers: " + this.customers.length);
            for(String customer : this.customers){
                System.out.println("Customer Name: " + customer);
            }
        }

        if(this.contracts != null){
            System.out.println("Total Contracts: " + this.contracts.length);
            for(Contract contract : this.contracts){
                System.out.println("Contract Type: " + contract.type);
                System.out.println("Contract Amount: " + contract.amount);
            }
        }
    }
}