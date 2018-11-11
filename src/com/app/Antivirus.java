package com.app;

public class Antivirus implements Observer {

    @Override
    public void fileAddedEvent(File file) {
        scan(file);
    }

    @Override
    public void fileDeletedEvent(File file) {
        System.out.println("file " + file.getName() + " deleted. Antivirus ignores this event");
    }

    private void scan(File file) {
        System.out.println("Scanning file " + file.getName());
    }
}
