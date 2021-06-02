package ru.postlife.java2.homework3;

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<String> lastNames;
    private ArrayList<String> phoneNumbers;

    public Phonebook() {
        lastNames = new ArrayList<>();
        phoneNumbers = new ArrayList<>();
    }

    public void add(String lastName, String phoneNumber){
        lastNames.add(lastName);
        phoneNumbers.add(phoneNumber);
    }

    public void get(String lastName){
        if(!lastNames.contains(lastName)){
            System.out.println("В справочнике по фамилии " + lastName + " нет номеров телефона");
            return;
        }
        System.out.println("Список номеров телеофна для людей с фамилией " + lastName);
        for (int i = 0; i < lastNames.size(); i++) {
            if(lastNames.get(i).equals(lastName))
                System.out.println(phoneNumbers.get(i));
        }
    }
}
