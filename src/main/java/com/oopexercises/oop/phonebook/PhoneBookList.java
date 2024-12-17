package com.oopexercises.oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person person) {
        if (phoneBook.size() == MAX_PERSONS || phoneBook.contains(person)) {
            return false;
        }
        phoneBook.add(person);
        return true;
    }

    @Override
//    public boolean removePerson(Person person) {
//        for (int i = 0; i < phoneBook.size(); i++) {
//            if (phoneBook.get(i).equals(person)) {
//                phoneBook.remove(i);
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean removePerson(Person person) {
        return phoneBook.remove(person);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person person : phoneBook) {
            if (person.lastname.equals(lastname)) {
                tmp.add(person);
            }
        }
        return tmp.toArray(new Person[0]);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person person : phoneBook) {
            if (person.name.equals(name) && person.lastname.equals(lastname)) {
                tmp.add(person);
            }
        }
        return tmp.toArray(new Person[0]);
    }
}
