package de.neuefische;

public abstract class Contact {

    private String name;

    public String getName() {
        return name;
    }

    public Contact(String name) {
        this.name = name;
    }

    public Contact() {
    }

    @Override
    public String toString() {
        return "Contact Name=" + name;
    }
}
