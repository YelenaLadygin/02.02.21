package com.company;

public class Car extends Vehicle {
    protected int m_number_of_doors ;

    public Car(int m_numberOfWheels, String m_model, int m_number_of_doors) {
        super(m_numberOfWheels, m_model);
        this.m_number_of_doors = m_number_of_doors;
    }

    @Override
    public int getMaxOfPassengers() {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }
}





