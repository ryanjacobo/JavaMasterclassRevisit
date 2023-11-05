package Inheritance;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        terminate("12/12/2040");
        isRetired = true;
    }

    public double collectPay(){
        double paycheck = annualSalary/26;
        double adjustedPay = isRetired ? 0.9 * paycheck : paycheck;
        return (int)adjustedPay;
    }

}
