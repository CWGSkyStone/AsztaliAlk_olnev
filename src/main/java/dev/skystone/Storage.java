package dev.skystone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    public static ArrayList<NameDict> readFile(){
        try {
            return tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    private static ArrayList<NameDict> tryReadFile() throws FileNotFoundException{
        ArrayList<NameDict> nameDictList = new ArrayList<>();
        String fileName = Prop.getFileName();
        File file = new File(fileName);
        try(Scanner sc = new Scanner(file, "utf-8")){
            sc.nextLine();
            while(sc.hasNextLine()){
                String[] line = sc.nextLine().split(":");
                nameDictList.add(new NameDict(line[0], line[1]));
            }
        }
        return nameDictList;
    }
}
