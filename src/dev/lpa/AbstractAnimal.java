package dev.lpa;

// An abstract class can extends the abstract class.
abstract class Mammal extends AbstractAnimal {


    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    public abstract void shedHair();

    @Override
    public void move(String speed) {
        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("slow")? "walks" : "runs");
    }


}

// we don't have to declare public
public abstract class AbstractAnimal {
    protected String type;
    private String size;
    private double weight;

    public AbstractAnimal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    // An abstract class can have both abstract and concrete method.
    // abstract method
    // It doesn't have a body, not even curly braces.
    // It only can be declared on an abstract class or interface.

    // Any code that uses a subtype of Animal, knows it can call the move method,
    // and the subtype will implement this method with this signature.

    public abstract void move(String speed);
    public abstract void makeNoise();
    // This is also true for a concrete class, and a concrete method that's overridden.

    // An abstract class can also have concrete method...
    public final String getExplicitType(){
        // The subclass can't override the final method!
        return getClass().getSimpleName() + " (" + type + ")";
    }


    // An abstract class doesn't have to (but it can) implement abstract methods
    // So AbstractAnimal class doesn't have to implement the abstract method of the Mammal Class.
}
