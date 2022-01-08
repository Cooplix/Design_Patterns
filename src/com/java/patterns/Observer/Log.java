package com.java.patterns.Observer;

public class Log {

    public static void log() {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        ConcreteObserver concreteObserverOne = new ConcreteObserver(concreteSubject);
        ConcreteObserver concreteObserverTwo = new ConcreteObserver(concreteSubject);
        ConcreteObserver concreteObserverThree = new ConcreteObserver(concreteSubject);
        ConcreteObserver concreteObserverFour = new ConcreteObserver(concreteSubject);
        ConcreteObserver concreteObserverFive = new ConcreteObserver(concreteSubject);

        concreteSubject.setState(5);
    }

}
