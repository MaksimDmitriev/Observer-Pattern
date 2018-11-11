package com.app;

public class Main {

    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();
        Antivirus antivirus = new Antivirus();
        FreeSpaceCalculator freeSpaceCalculator = new FreeSpaceCalculator();
        fileSystem.addObserver(antivirus);
        fileSystem.addObserver(freeSpaceCalculator);

        File txtFile = new File("123.txt");
        fileSystem.createFile(txtFile);
        File docFile = new File("123.doc");
        fileSystem.createFile(docFile);

        fileSystem.deleteFile(txtFile);

        fileSystem.removeObserver(antivirus);

        File datFile = new File("456.dat");
        fileSystem.createFile(datFile);

    }
}
