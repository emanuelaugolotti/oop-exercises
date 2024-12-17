package com.oopexercises1.oopexercises.oop.phonebook;

import com.oopexercises.oop.phonebook.Person;
import com.oopexercises.oop.phonebook.PhoneBookList;
import org.junit.jupiter.api.BeforeEach;

class PhoneBookListTest extends PhoneBookTestBase {
    @BeforeEach
    void setUp() {
        pb = new PhoneBookList();
        pb.addPerson(new Person("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new Person("Marco", "Rizzo", "45243"));
        pb.addPerson(new Person("Luisa", "Poppi", "24564"));
    }
}