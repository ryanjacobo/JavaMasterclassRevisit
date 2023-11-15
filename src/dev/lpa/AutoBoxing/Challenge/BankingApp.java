package dev.lpa.AutoBoxing.Challenge;

import java.util.ArrayList;

public class BankingApp {
    public static void main(String[] args) {
        Customer ryan = new Customer("Ryan");
        ryan.transact(500, -100, 150, -200, -50);
        System.out.println(ryan);

        Bank newBank = new Bank("Kipster Bank");
        newBank.addNewCust(ryan);
        System.out.println(newBank);
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public ArrayList<Customer> addNewCust(Customer customer){
        this.customers.add(customer);
        return customers;
    }

    public Bank(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}

class Customer {
  private String name;
  private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public ArrayList<Double> transact(double... amounts){
        for(double t : amounts){
            transactions.add(t);
        }
        return transactions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
