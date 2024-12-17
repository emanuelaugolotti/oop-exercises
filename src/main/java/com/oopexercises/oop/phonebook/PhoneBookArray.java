package com.oopexercises.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook {
    final Person[] phoneBook;

    public PhoneBookArray() {
        phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public boolean addPerson(Person person) {
        int index = -1;
        boolean find = false;
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] != null && phoneBook[i].equals(person)) {
                return false;
            }
            if (!find && phoneBook[i] == null) {
                index = i;
                find = true;
            }
        }
        if (index == -1) {
            return false;
        }
        phoneBook[index] = person;
        return true;
    }

    @Override
    public boolean removePerson(Person person) {
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] != null && phoneBook[i].equals(person)) {
                phoneBook[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        Person[] tmp = new Person[MAX_PERSONS];
        int count = 0;
        for (Person person : phoneBook) {   //pull request su ottimizzazione del for
            if (person != null && person.lastname.equals(lastname)) {
                tmp[count] = person;
                count++;
            }
        }
        return Arrays.copyOf(tmp, count);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        Person[] tmp = new Person[MAX_PERSONS];
        int count = 0;
        for (Person person : phoneBook) {   //pull request su ottimizzazione del for
            if (person != null && person.name.equals(name) && person.lastname.equals(lastname)) {
                tmp[count] = person;
                count++;
            }
        }
        return Arrays.copyOf(tmp, count);
    }
}