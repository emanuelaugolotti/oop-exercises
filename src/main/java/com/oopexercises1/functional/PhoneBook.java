package com.oopexercises1.functional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PhoneBook {

    List<Person> persons;

    public static class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getLastname() {
            return lastname;
        }

        public String getPhone() {
            return phone;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(phone, person.phone);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, lastname, phone);
        }

        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", lastname='" + lastname + '\'' + ", phone='" + phone + '\'' + '}';
        }
    }

    public PhoneBook(List<Person> persons) {
        this.persons = persons;
    }

    public Optional<Person> searchByLastname(String lastname) {
        return persons.stream()
                .filter(person -> person.getLastname().equals(lastname))
                .findFirst();
    }

    public Optional<Person> searchByNameAndLastname(String name, String lastname) {
        return persons.stream()
                .filter(person -> person.getLastname().equals(lastname) && person.getName().equals(name))
                .findFirst();
    }
}
