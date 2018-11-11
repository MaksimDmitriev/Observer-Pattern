package com.app;

public interface Observer {

    void fileAddedEvent(File file);

    void fileDeletedEvent(File file);

}
