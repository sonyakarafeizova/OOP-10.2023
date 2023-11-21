package Polymorphism.animals;

public class Dog extends Animal{
    protected Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }
    public String explainSelf() {
        return String.format("%s%nDJAAF",super.explainSelf());
    }
}
