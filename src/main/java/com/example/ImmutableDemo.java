package com.example;

import com.google.common.collect.ImmutableList;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ImmutableDemo {

    public static void main(String[] args) throws IOException {

        // Immutable String Demonstration
        String original = "Hello";

        String modified = original.concat(" World");

        System.out.println("Original String: " + original);

        System.out.println("Modified String: " + modified);

        // Immutable List using Guava
        ImmutableList<String> list = ImmutableList.of(
                "Java",
                "Maven",
                "Jenkins"
        );

        System.out.println("Immutable List: " + list);

        // File Copy Operation
        File source = new File("source.txt");

        File destination = new File("destination.txt");

        FileUtils.copyFile(source, destination);

        System.out.println("File copied successfully.");
    }
}

