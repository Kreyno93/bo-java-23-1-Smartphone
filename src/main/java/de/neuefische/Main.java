package de.neuefische;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Contact friend1 = new Friend("Friend1","12312313");
        Contact friend2 = new Friend("Friend2","654365346");
        Contact friend3 = new Friend("Friend3","018054646");
        Contact business1 = new BusinessContact("BusinessMan","CurrywurstFabrik");
        Contact business2 = new BusinessContact("BusinessWoman","LabelloBeschleuniger");
        Contact business3 = new BusinessContact("BusinessMan","GeheimratsEckenWeg");
        Contact[] contacts = {friend1,friend2,friend3,business1,business2,business3};

        Smartphone mySmartphone = new Smartphone("Iphone", "12 Pro Max", contacts);


    }
}