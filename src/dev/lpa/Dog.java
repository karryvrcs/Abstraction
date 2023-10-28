package dev.lpa;

public class Dog extends AbstractAnimal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    // Subclass dog must either be declared abstract or implement abstract method (move, makeNoise...) in parent class Animal.
    @Override
    public void move(String speed) {

        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " walking");
        } else {
            System.out.println(getExplicitType() + " running");
        }
    }

    @Override
    public void makeNoise() {
        // we specified type is protected, so type can be access directly
        if (type == "Wolf") {
            System.out.println("Howling!");
        } else {
            System.out.println("Woof!");
        }
    }


}
