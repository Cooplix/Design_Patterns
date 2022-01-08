package com.java.patterns.Observer;

import java.util.Observable;

public class ConcreteSubject extends Observable {
    private int state = 0;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.setChanged();
        this.notifyObservers(state);
    }
}
