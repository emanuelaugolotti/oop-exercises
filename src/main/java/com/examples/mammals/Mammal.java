package com.examples.mammals;

public class Mammal {
    public String sayHello() {
        return "random stuff";
    }
}

class Cat extends Mammal {

    @Override
    public String sayHello() {
        return "meow";
    }
}

class Dog extends Mammal {

    @Override
    public String sayHello() {
        return "bau";
    }
}
class Human extends Mammal {

    @Override
    public String sayHello() {
        return "hello";
    }

    public static void main(String[] args) {
        Mammal mammal1 = new Mammal();
        System.out.println(mammal1.sayHello()); // it prints "random stuff"

        Cat cat1 = new Cat();
        System.out.println(cat1.sayHello()); // it prints "meow"

        Cat cat2 = new Cat();
        System.out.println(cat2.sayHello()); // it prints "meow"

        Dog dog = new Dog();
        System.out.println(dog.sayHello()); // it prints "bau"

        Human human = new Human();
        System.out.println(human.sayHello()); // it prints "hello"

        //Qui si vede il polimorfismo dinamico
        Mammal[] mammals = {human, cat1, cat2, dog};    //metto dentro ad un array di mammiferi, usando un riferimento
        // generico mammifero, dei mammiferi più specifici
        // Questo esempio abita il polimorfismo in quanto non sappiamo quale metodo verrà chiamato. Il compilatore a tempo
        // di compilazione non sa quale metodo verrà chiamato, lo scopre a runtime in base al tipo di elemento sul quale
        // viene chiamato il metodo.

        for(Mammal mammal : mammals) {
            System.out.println(mammal.sayHello()); // it prints "hello", "meow", ",meow","bau"
        }
    }
}
