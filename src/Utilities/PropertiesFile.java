package Utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile
    /* Here in this programe we will learn how to create a properties file
    this can be done using Property class methods specially set property meyhod */ {
   /* public static void main(String[] args)
    {
        Properties Pr = new Properties();
        try {
            OutputStream DbProperties = new FileOutputStream("DB properties");
            Pr.setProperty("DBname","AniketSeleniumDB");
            Pr.setProperty("DBip","172.198.0.1");
            Pr.setProperty("DBlocation","c/desktop");
            Pr.store(DbProperties, null);
        }catch(IOException io){
            io.printStackTrace();
        }

    }*/
   public static void main(String[] args) throws FileNotFoundException {
       Properties prop = new Properties();
       OutputStream OS = new FileOutputStream("Aniket Home Properties");
       prop.setProperty("Name", "Vudyankush");
       prop.setProperty("Address","Shrigonda");
       prop.setProperty("cost","1500000");
       try {
           prop.store(OS,"OS");
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

}