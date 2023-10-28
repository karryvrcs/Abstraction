package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // we can't create an instance of an abstract class.
        // Animal a = new Animal();
//        Animal animal = new Animal("animal", "big", "100");


        // There is no concrete method for a subclass to inherit code from.
        // Instead, the subclass must provide a concrete method for any abstract method declared on its parent.
        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();

        System.out.println("-".repeat(20));
        doAnimalStuff(dog);

        Fish fish = new Fish("Another", "small", 50);
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(fish);
        animals.add(new Horse("Clydesdale", "large", 1000));
        animals.addAll(Arrays.asList(dog,fish));

        System.out.println("-".repeat(20));
        // We can have an arraylist of an abstracted type
        // at runtime, instances that inherit from that class.
        for(AbstractAnimal animal : animals){

            doAnimalStuff(animal);
            System.out.println();
            if (animal instanceof Mammal currentMammal){
                // 从Java 16开始，你可以使用称为“模式匹配的instanceof”的特性，这允许你在一个if语句中同时做类型检查和变量声明。
                // 如果不声明currenMammal，必须先显式声明：
//                Mammal currentMammal = (Mammal) animal;
//                currentMammal.shedHair();

                currentMammal.shedHair();
            }
        }

    }

    private static void doAnimalStuff(AbstractAnimal animal){
        // Regardless of what that object is, as long as it's an Animal,
        // meaning it has the Animal class in its hierarchy, this code will continue to work.
        // 运行时多态-方法重写
        // Use polymorphism to execute code specific to the concrete type.
        // This is abstraction, promoting polymorphism techniques.
        animal.makeNoise();
        animal.move("slow");
        System.out.println(animal.getExplicitType());
    }
}