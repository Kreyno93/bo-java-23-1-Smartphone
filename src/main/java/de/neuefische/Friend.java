package de.neuefische;

public class Friend extends Contact{

    private String telephoneNumber;

    public Friend(String name, String telephoneNumber) {
        super(name);
        this.telephoneNumber = telephoneNumber;
    }

    public Friend() {
    }

    @Override
    public String toString() {
        return "Friend : telephoneNumber=" + telephoneNumber +" Name=" + getName();
    }
}
