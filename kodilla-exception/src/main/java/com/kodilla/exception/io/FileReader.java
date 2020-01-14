package com.kodilla.exception.io;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() throws FileReaderException  {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){

            fileLines.forEach(System.out::println);

        } catch (IOException e) {

            throw new FileReaderException();

        } finally {
            System.out.println("I am gonna be here... always");
        }

    }
}