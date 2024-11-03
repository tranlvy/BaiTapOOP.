public class Account {
    private int id;
    private double balance ;
    private Customer customer;

    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
        balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String toString(){
        return " " + customer + "balance=$" + String.format("%.2f", balance);
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account deposit(double amount){
        this.balance += amount;
        return new Account(this.id, this.customer, this.balance);
    }

    public Account withdraw(double amount){
        if(balance > amount){
            this.balance = balance - amount;
        }
        else{
            System.out.println(" amount withdraw exceeds the current balance! ");
            this.balance = balance-0;
        }
        return new Account(this.id, this.customer, this.balance);
    }
}
