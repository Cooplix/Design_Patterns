package com.java.patterns.Memento;

class SmartAppMemento {

    private Double version;

    SmartAppMemento(Double version) {
        this.version = version;
    }

    Double getVersion() {
        return version;
    }
}
