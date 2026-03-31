package dev.skystone;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Prop {
    public static String getFileName(){
        try {
            return tryGetFileName();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return "";
        }
    }
    private static String tryGetFileName() throws IOException{
        Properties prop = new Properties();
        String configFileName = "Project.config";
        InputStream inputStream = new FileInputStream(configFileName);
        prop.load(inputStream);
        return prop.getProperty("File.name");
    }
}
