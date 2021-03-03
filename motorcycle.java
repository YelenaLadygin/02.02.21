package com.company;

public class motorcycle extends Vehicle {

    protected float m_hand_break_size;

    public motorcycle(int m_numberOfWheels, String m_model, float m_hand_break_size) {
        super(m_numberOfWheels, m_model);
        this.m_hand_break_size = m_hand_break_size;
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
