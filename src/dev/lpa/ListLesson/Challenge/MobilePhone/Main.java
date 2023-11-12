package dev.lpa.ListLesson.Challenge.MobilePhone;

public class Main {
    public static void main(String[] args) {
        MobilePhone ryanPhone = new MobilePhone("650-793-9870");
        Contact abby = new Contact("Abby", "650-987-6541");
        ryanPhone.addNewContact(abby);
        ryanPhone.printContacts();
    }
}
