package Utilities;

import java.io.*;
import java.util.Properties;

public class PracticeClass {

    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream("Aniket Home Properties");
        prop.load(input);
        System.out.println(prop.getProperty("cost"));
        System.out.println(prop.getProperty("Address"));
        System.out.println( prop.getProperty("Name"));
    }
}
