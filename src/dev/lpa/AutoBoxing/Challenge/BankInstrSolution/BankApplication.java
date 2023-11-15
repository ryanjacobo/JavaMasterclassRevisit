package dev.lpa.AutoBoxing.Challenge.BankInstrSolution;

import java.util.ArrayList;

public class BankApplication {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Ryan", 3000);
        bank.addNewCustomer("Jane A.", 500);
        bank.addTransaction("RYan", -200);
        System.out.println(bank);
        bank.printStatement("Ryan");

        bank.addNewCustomer(bob);
        bank.printStatement("Bob S");
    }
}

class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    private Customer getCustomer(String customerName) {
        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }

    public void addNewCustomer(Customer customer){
        if(getCustomer(customer.name()) == null){
            customers.add(customer);
            System.out.println("New Customer added: " + customer.name());
        }
    }

    public void addTransaction(String name, double transactionAmount){
        Customer customer = getCustomer(name);
        if(customer != null){
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if(customer == null){
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions: ");
        for(double d : customer.transactions()){
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}

record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}
