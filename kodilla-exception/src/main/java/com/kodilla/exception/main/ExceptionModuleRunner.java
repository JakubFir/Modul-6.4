package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

import java.io.File;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        File file = new File(("names.txt"));

        try {
            fileReader.readFile(file.getName());
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}