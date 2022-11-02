package org.example;

public enum State {
    ACTIVE(0),
    INACTIVE(1),
    CLOSED(2);

    int code;

    State(int i) {

    }

    public int getCode() {
        return code;
    }

    public static final State[] STATES = values();

    public static State getState(int code){
        return STATES[code];
    }
}
