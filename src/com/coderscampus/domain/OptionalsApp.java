package com.coderscampus.domain;

import java.util.ArrayList;
import java.util.List;

public class OptionalsApp {
    public static void main(String[] args) {
        String FILE_NAME = "InterpolWatchReport-Week";
        Integer fileNum = 3;
        FileService fileService = new FileService();
        List<SuspectLocation> suspectLocationList = new ArrayList<>();

        for (int i = 1; i <= fileNum; i++) {
            fileService.readFile(FILE_NAME + i + ".csv", suspectLocationList);
            System.out.println("Week " + i + ":");
            suspectLocationList.stream()
                    .filter(suspect -> suspect.getName().equals("CARMEN SANDIEGO"))
                    .findAny()
                    .ifPresentOrElse(suspectLocation -> System.out.println("Carmen Sandiego is in..." + suspectLocation.getCountry()), () -> System.out.println("Couldn't find her!"));
            System.out.println();
            suspectLocationList.clear();
        }
    }
}
