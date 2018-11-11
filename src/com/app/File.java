package com.app;

import java.util.Random;

public class File {

    private final int size;
    private final String name;

    public File(String name) {
        this.name = name;
        this.size = new Random().nextInt(10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof File)) {
            return false;
        }
        File other = (File) o;
        return name.equals(other.name);
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
