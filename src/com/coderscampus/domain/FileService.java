package com.coderscampus.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
    private final String INPUT_FILE = "InterpolWatchReport";
    private String header;

    void readFile(int i) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE + i + ".csv"))) {
            header = bufferedReader.readLine();

            /*Testing if this is a viable way to read all the lines*/
            while (bufferedReader.ready()) {

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
