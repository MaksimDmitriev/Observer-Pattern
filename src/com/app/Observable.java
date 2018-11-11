package com.app;

public interface Observable {

    void addObserver(final Observer observer);

    void removeObserver(final Observer observer);
}
