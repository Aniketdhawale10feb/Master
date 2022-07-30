package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.spec.ECField;
import java.util.Properties;

public class ReadPropFIle {
    public static void main(String[] args) {
        try{
        Properties prp = new Properties();
        InputStream read = new FileInputStream("DB properties");
        prp.load(read);
        System.out.println("DB location is "+prp.getProperty("DBlocation"));
        System.out.println("DB name is "+prp.getProperty("DBname"));
        System.out.println("DB ip is "+prp.getProperty("DBip"));

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
