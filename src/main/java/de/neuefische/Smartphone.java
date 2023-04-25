package de.neuefische;

import java.util.Arrays;
import java.util.Objects;

public class Smartphone implements GPS,Radio{

    private String modell;
    private String brand;
    private Contact[] contacts;


    public void addContact(Contact contact) {
        Contact[] withNewContact = Arrays.copyOf(contacts, contacts.length + 1);
        withNewContact[contacts.length] = contact;
        this.contacts = withNewContact;
    }

    public Contact getContactByIndex(int index) {
        return contacts[index];
    }

    public Contact getContactByName(String name) {
        for (Contact contact : contacts) {
            if (Objects.equals(contact.getName(), name)) {
                return contact;
            }
        }
        return null;
    }

    public void removeContactByName(String name){
        Contact[] withoutContact = new Contact[contacts.length - 1];
        int index = 0;
        for (Contact contact : contacts) {
            if (!Objects.equals(contact.getName(), name)) {
                withoutContact[index] = contact;
                index++;
            }
        }
        this.contacts = withoutContact;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started!");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public Smartphone(String modell, String brand, Contact[] contacts) {
        this.modell = modell;
        this.brand = brand;
        this.contacts = contacts;
    }

    public Smartphone() {
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Smartphone Brand=" + brand + " Modell=" + modell + " Contacts=" + Arrays.toString(contacts);
    }
}
