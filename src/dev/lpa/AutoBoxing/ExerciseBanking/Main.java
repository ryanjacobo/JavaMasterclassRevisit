package dev.lpa.AutoBoxing.ExerciseBanking;

public class Main {
    public static void main(String[] args) {
//        Customer ryan = new Customer("Ryan", 5000);
//        ryan.addTransaction(1000);
//        System.out.println(ryan);

//        Bank bank = new Bank("National Australia Bank");
//        bank.addBranch("Adelaide");
//        bank.addCustomer("Adelaide", "Ryan", 5000.00);
//        bank.addCustomerTransaction("Adelaide", "Ryan", 1500.50);
//        bank.addCustomer("Adelaide", "Marty", 2000.00);
//        bank.listCustomers("Adelaide", true);

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
        bank.addCustomer("Adelaide", "Percy", 220.12);
        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Ryan", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
        bank.listCustomers("Adelaide", true);
    }
}
