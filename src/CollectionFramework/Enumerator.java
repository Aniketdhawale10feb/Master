package CollectionFramework;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Enumerator {
    // enumerator is a kind of iterator used to iterate over Vectors
    // Vector are similar to Array list only we have to create object of those



    public static void main (String[] args){

//Created an object of Vector class
    Vector v= new Vector();

//added elements in vector
    v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);


        //printed the vector
        System.out.println(v);

// used enumaration interface to get the individual objects from vector
        Enumeration e=v.elements();
//printed all values individually from vector converted in to intergers
        while(e.hasMoreElements()){
           int i= (int) e.nextElement();
            System.out.println(i);
        }
// checking the one by one value from the vector and printing it
        int c= (int ) e.nextElement();
        int d= (int ) e.nextElement();
        int f =(int ) v.elementAt(3);

        System.out.println(c);
        System.out.println(d);
        System.out.println(10+f);
    }







}
