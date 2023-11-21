package Polymorphism.vehicle;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    private static final double SUMMER_FUEL_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + SUMMER_FUEL_CONSUMPTION);
    }

    @Override
    protected void driving(double km) {
        if (fuelQuantity / fuelConsumption < km) {
            System.out.println("Truck needs refueling");
        } else {
            DecimalFormat df = new DecimalFormat("#.##");

            super.setFuelQuantity(super.getFuelQuantity() - super.fuelConsumption * km);
            System.out.printf("Truck travelled %s km%n", df.format(km));
        }
    }

    @Override
    public void refueling(double litters) {
        super.setFuelQuantity(super.getFuelQuantity() + 0.95 * litters);
    }
}
