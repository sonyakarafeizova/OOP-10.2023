package Polymorphism.vehicles_extend;

public interface Vehicle  {

    String drive(double distance);

    void refuel(double liters);

    double getFuelConsumption();

    void setFuelConsumption(double fuelConsumption);

    default boolean isEmpty() {
        return true;
    }

    default void setEmpty(boolean empty) {

    }
    default void turnOnOfAc(boolean isEmpty) {

    }
}
