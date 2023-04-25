package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    Contact testFriend = new Friend("Max", "123456789");
    Contact testFriend2 = new BusinessContact("Moritz", "56311231");

    Contact[] contacts = {testFriend, testFriend2};
    Smartphone smartphone = new Smartphone("Samsung", "S20", contacts);

    @Test
    void testToString() {
        String expected = "Smartphone Brand=S20 Modell=Samsung Contacts=[Friend : telephoneNumber=123456789 Name=Max, BusinessContact{companyName='56311231'} Contact Name=Moritz]";
        String actual = smartphone.toString();
        assertEquals(expected, actual);
    }

    @Test
    void whenAddingContact_thenCheckContactIsInArray() {
        Contact testFriend3 = new Friend("Max", "123456789");
        smartphone.addContact(testFriend3);
        Contact[] expected = {testFriend, testFriend2, testFriend3};
        Contact[] actual = smartphone.getContacts();
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenRemovingContactByName_thenCheckContactIsNotInArray() {
        smartphone.removeContactByName("Max");
        Contact[] expected = {testFriend2};
        Contact[] actual = smartphone.getContacts();
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenGetContactByIndex_thenReturnCorrectContact(){
        Contact expected = testFriend;
        Contact actual = smartphone.getContactByIndex(0);
        assertEquals(expected, actual);
    }

    @Test
    void whenGetPosition_returnKöln(){
        String expected = "Köln";
        String actual = smartphone.getPosition();
        assertEquals(expected, actual);
    }

    @Test
    void whenStartRadio_thenReturnTrue(){
        boolean expected = true;
        boolean actual = smartphone.startRadio();
        assertEquals(expected, actual);
    }

    @Test
    void whenStopRadio_thenReturnFalse(){
        boolean expected = false;
        boolean actual = smartphone.stopRadio();
        assertEquals(expected, actual);
    }

}