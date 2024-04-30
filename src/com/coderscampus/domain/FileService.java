package com.coderscampus.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileService {
    private String header;

    void readFile(String inputFile, List<SuspectLocation> suspectLocationList) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile))) {
            String[] lineData;
            header = bufferedReader.readLine();

            /*Testing if this is a viable way to read all the lines*/
            while (bufferedReader.ready()) {
//                SuspectLocation newEntry = ;
                lineData = bufferedReader.readLine().split(",|\\r\\n|\\n");

                suspectLocationList.add(new SuspectLocation(lineData[1], lineData[0]));
//                System.out.println(lineData[0] + lineData[1]);

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
