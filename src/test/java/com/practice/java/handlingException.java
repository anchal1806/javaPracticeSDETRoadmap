package com.practice.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class handlingException {

    public static void main(String args[]) throws IOException {
       readFile();
    }

    static void readFile() throws FileNotFoundException {
        FileReader fr = null;
        fr = new FileReader("");



        //   fr.read();
       // fr.close();
        throw new FileNotFoundException(
                "Hey I got caught");

    }
}
