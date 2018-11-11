package com.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileSystem implements Observable {

    private final Set<Observer> observers = new HashSet<>();
    private final List<File> files = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void createFile(File file) {
        files.add(file);
        observers.forEach(observer -> observer.fileAddedEvent(file));
    }

    public void deleteFile(File file) {
        files.remove(file);
        observers.forEach(observer -> observer.fileDeletedEvent(file));
    }

}
