package CollectionFramework;

import org.apache.commons.math3.util.MultidimensionalCounter;

import java.util.ArrayList;
import java.util.Scanner;

public class Iterator

{

    public static void main(String[]args)
    {
        Iterator i= new Iterator();
        i.SimpleIterator();

    }

     public void SimpleIterator()

     {

         ArrayList al= new ArrayList<>();
         System.out.println("Please Enter the 10 numbers to find the Even numbers from them");
         for (int i= 0; i<=10; i++)
         {
             Scanner sc= new Scanner(System.in);
             al.add(sc.nextInt());
         }
         System.out.println(al);

         java.util.Iterator IT= al.iterator();
         while (IT.hasNext())
         {
             if( (Integer) IT.next()%2!=0)
             {
                 IT.remove();
             }
         }
         System.out.println("The even number seta are "+ al);
     }

     }


