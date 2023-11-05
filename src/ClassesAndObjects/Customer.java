package ClassesAndObjects;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(){
        // if no params is provided, constructor calls 2-params constructor
        this("no name", "default@email.com");
//        System.out.println("Empty constructor is called.");
    }

    public Customer(String name, String email){
        // if only 2 params are provided, constructor calls the 3-params constructor and assigns a default creditLimit
        this(name, 550, email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }
}
