package com.java.patterns.Memento;

public class Main {
    public static void main(String[] args) {
        SmartAppCaretaker smartAppCaretaker = new SmartAppCaretaker();
        SmartApp smartApp = new SmartApp();

        smartApp.changeVersion(1.0);
        smartApp.changeVersion(1.2);

        smartAppCaretaker.addMemento(smartApp.save());

        smartApp.changeVersion(1.3);

        smartApp.load(smartAppCaretaker.getMemento(0));

        smartApp.changeVersion(1.5);
        smartApp.changeVersion(2.0);

        smartAppCaretaker.addMemento(smartApp.save());

        smartApp.changeVersion(2.1);

        smartApp.load(smartAppCaretaker.getMemento(1));
    }
}
