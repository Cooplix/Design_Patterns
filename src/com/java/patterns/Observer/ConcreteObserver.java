package com.java.patterns.Observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

    private ConcreteSubject concreteSubject;

    public ConcreteObserver(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
        this.concreteSubject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer: " + arg);
    }
}
