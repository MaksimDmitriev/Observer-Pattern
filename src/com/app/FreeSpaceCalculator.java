package com.app;

public class FreeSpaceCalculator implements Observer {

    private int freeSpace = 1000;

    @Override
    public void fileAddedEvent(File file) {
        freeSpace -= file.getSize();
        System.out.println("free space: " + freeSpace);
    }

    @Override
    public void fileDeletedEvent(File file) {
        freeSpace += file.getSize();
        System.out.println("free space: " + freeSpace);
    }
}
