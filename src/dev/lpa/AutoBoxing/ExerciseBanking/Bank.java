package dev.lpa.AutoBoxing.ExerciseBanking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String branchName){
        for(Branch b : branches){
            if(b.getName().equalsIgnoreCase(branchName)){
                return b;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            Branch newBranch = new Branch(branchName);
            branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, initialTransaction);
//            return true; // adding a customer (that already exists) to a branch return true, expected false in Udemy
        }
        System.out.println(branchName + " doesn't exist.");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, transaction);
//            return true; // adding a customer (that doesn't exist) transaction returns true, expected false in Udemy
        }
        System.out.println(branchName + " doesn't exist.");
        return false;

    }


    public boolean listCustomers(String branchName, boolean printTransactions){
        var branch = findBranch(branchName);
        if(branch != null){
            System.out.printf("Customer details for branch %s%n", branchName);
            int custNumber = 1;
            for(Customer c : branch.getCustomers()){
                System.out.printf("Customer: %s[%d]%n", c.getName(),custNumber);
//                System.out.println(c.getTransactions());
                if(printTransactions){
                    System.out.println("Transactions");
                    int tNumber = 1;
                    for(var t : c.getTransactions()){
                        System.out.printf("[%d] Amount %.2f%n", tNumber, t);
                        tNumber++;
                    }
                }
                custNumber++;
            }
            return true;
        }
        return false;
    }
}

class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double transaction){
        if(findCustomer(customerName) == null){
            Customer newCustomer = new Customer(customerName, transaction);
            customers.add(newCustomer);
            return true;
        }
        System.out.println(customerName + " already exists.");
        return false;
    }

    public boolean newCustomer(Customer customer){
        if(findCustomer(customer.getName()) == null){
            customers.add(findCustomer(customer.getName()));
            return true;
        }
        System.out.printf("%s already exists.%n", customer.getName());
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer customer = findCustomer(customerName);
        if(customer == null){
            System.out.println(customerName + " doesn't exist in " + this.name + " branch.");
            return false;
        }
        customer.addTransaction(transaction);
//        System.out.printf("$%.2f (%s)%n", Math.abs(transaction),  transaction >= 0 ? "Credited" : "Debited" );
        return true;
    }

    private Customer findCustomer(String customerName){
        for(Customer c : customers){
            if(c.getName().equals(customerName)){
                return c;
            }
        }
        return null;
    }
}

class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String customerName, double transaction){
        this.name = customerName;
        this.transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}


