package com.coderscampus.domain;

import java.util.ArrayList;
import java.util.List;

public class OptionalsApp {
    public static void main(String[] args) {
        String FILE_NAME = "InterpolWatchReport-Week";
        Integer fileNum = 3;
        FileService fileService = new FileService();
        List<SuspectLocation> suspectLocation = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            fileService.readFile(FILE_NAME + fileNum + ".csv", suspectLocation);
            System.out.println("Week " + i + ":" + "\\n");
        }
    }
}
