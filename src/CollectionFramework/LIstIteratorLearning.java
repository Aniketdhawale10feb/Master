package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class LIstIteratorLearning
{

    public static void main(String[] args)
    {
        LIstIteratorLearning LIT=new LIstIteratorLearning();
        LIT.ListITR();
    }

    public void ListITR()
    {
        ArrayList arl= new ArrayList<>();
        for (int i= 0; i<=10; i++)
        {
            arl.add(i);
        }
        System.out.println(arl);



        ListIterator li= arl.listIterator();// this is new iterator
        int EvenCounter=0;
        while(li.hasNext())// here we have used has next method
        {
            int j= (Integer) li.next();// just defined j as new integer
            if (j % 2 == 0 && j!=0)
            {
                li.set("Even number");// This method is replacing the even numbers by String "Even Number"
                EvenCounter++;
                li.add(j);// this methid is adding j value in the ARL just next to even number
                //System.out.println(li.previousIndex());
            }
        }
        System.out.println(arl);
        System.out.println("Even counter is "+EvenCounter);
    }
}
