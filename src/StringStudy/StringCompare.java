package StringStudy;

import java.sql.SQLOutput;

public class StringCompare extends StringInf {

    /* Here we have used the .equals method from string class to compare two strings

     */
    public static void main(String[] args)
    {
        System.out.println("*******************************************************");
        System.out.println("comparing two strings with equals method");
        // comparing two strings with "equals" method
        StringInf str= new StringInf();
        System.out.println(str.Name1.equals(str.Name2));
        System.out.println("comparing two strings defined using object reference");
        str.compare();

        System.out.println("*******************************************************");
        System.out.println("comparing two strings with equals ignore case method");
        // Comparing two strings with "Equals ignore case" method
        System.out.println(str.Name1.equalsIgnoreCase(str.Name2));
        System.out.println(str.Name3.equalsIgnoreCase(str.Name4));

        System.out.println("*******************************************************");
        System.out.println("comparing two strings with == operator");
        System.out.println(str.Name1==str.Name2);//
        System.out.println(str.Name2==str.Name4);// == operator will always give false while comaring the strings defined with object reference eg. String A = New String("A is a alphabet")
        

    }
}
