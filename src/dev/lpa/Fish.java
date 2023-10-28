package dev.lpa;

public class Fish extends AbstractAnimal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    // Class dog must either be declared abstract or implement abstract method (move, makeNoise...) in Animal.
    @Override
    public void move(String speed) {

        if (speed.equals("slow")) {
            System.out.println(type + " lazily swimming");
        } else {
            System.out.println(type + " darting frantically");
        }
    }

    @Override
    public void makeNoise() {
        // we specified type is protected, so type can be access directly
        if (type == "Goldfish") {
            System.out.println("swish!");
        } else {
            System.out.println("splash!");
        }
    }
}
