class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow moos");
    }
}
public class Main {
    public static void main(String[] args) {
        // Dog myDog = new Dog();
        // myDog.makeSound();
        // Cat myCat = new Cat();
        // myCat.makeSound();
        // Cow mycow = new Cow();
        // mycow.makeSound();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();
        for (Animal animal : animals) {
            animal.makeSound();
    }
    }
}
