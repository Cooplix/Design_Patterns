package com.java.patterns.Memento;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCaretaker {
    private List<SmartAppMemento> mementos = new ArrayList<SmartAppMemento>();

    public void addMemento(SmartAppMemento smartAppMemento) {
        mementos.add(smartAppMemento);
        System.out.println("Version add: " + smartAppMemento.getVersion() + " is under the index: " + (mementos.size() - 1) );
    }

    public SmartAppMemento getMemento(int index) {
        System.out.println("Read version: " + mementos.get(index).getVersion());
        return mementos.get(index);
    }
}
