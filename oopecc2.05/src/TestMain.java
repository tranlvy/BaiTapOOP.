public class TestMain {
    public static void main(String[] args){
        Customer c1 = new Customer(101, "Lyn", 25);
        System.out.println(c1);
        Account a1 = new Account(202, c1, 105.789);
        System.out.println(a1);
        Account a2 = new Account(202, c1);
        System.out.println(" Id is: " + a1.getCustomer().getId());
        System.out.println(" Name is: " + a1.getCustomer().getName());
        System.out.println(" Gender is: " + a1.getCustomer().getGender());
        System.out.println(" Id is: " + a1.getId());
        System.out.println(" Name is: " + a1.getCustomerName());
        a1.setBalance(342.45);
        System.out.println(" Balance is: " + a1.getBalance());
        System.out.println(a1);
        System.out.println(a1.deposit(35.0));
        System.out.println(a1.withdraw(400.0));
        System.out.println(a1.withdraw(58.0));
    }
}
