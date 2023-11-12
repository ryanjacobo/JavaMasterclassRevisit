package dev.lpa.ListLesson.Challenge.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // gets the index of contact
    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    // gets the index when contact name is provided
    public int findContact(String name){
      for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
      }
      return -1;
    }
    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) < 0){
            myContacts.add(contact);
            return true;
        }
      return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position<0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1){
            System.out.println(oldContact.getName() + " already exists. Update not successful.");
            return false;
        }
        this.myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + ", was replacedwith " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position<0){
            System.out.println(contact + ", was not found.");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println(contact + ", was deleted.");
        return true;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        return position >= 0 ? this.myContacts.get(position) : null;
    }

    public void printContacts(){
        System.out.println("Contact List: ");
        for(int i = 0; i < this.myContacts.size(); i++){
            System.out.println(i + 1 + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}

