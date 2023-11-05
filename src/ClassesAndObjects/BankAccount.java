package ClassesAndObjects;

public class BankAccount {
    private long accountNumber;
    private double balance = 0;
    private String custName;
    private String email;
    private String phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public BankAccount(){
        // construction chaining, must be the first statement in the constructor body
        this(123, 2.50, "Default name", "default@email.com", "123-456-7890");
        System.out.println("Explicit constructor called.");
    }

    public BankAccount(long accountNumber, double balance, String custName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println(amount + " deposited to the account.");
    }

    public void withdraw(double amount){
        if(amount>this.balance){
            System.out.println("Amount is greater than available balance.");
        } else {
            this.balance -= amount;
            System.out.println(amount + " withdrawn from the account.");
        }
    }

    public void printAccount(){
        System.out.println("Account Number: " + accountNumber + " Balance: " + balance + " Customer Name: " + custName + " Email: " + email + " Phone Number: " + phoneNumber);
    }
}
