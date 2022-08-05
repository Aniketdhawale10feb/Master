package CollectionFramework;

import java.util.*;
import java.util.Iterator;

public class LinkedListLearning
{
    public static void main(String[] args)
    {
        LinkedListLearning LLL= new LinkedListLearning();
        LLL.LinkedListPractice();
    }

    public void LinkedListPractice(){

        // linked list and list has on  diffrence if memory stprage type, that Linked list
        // stores the objects in the doubely format so its called al linked list

        LinkedList ll = new LinkedList();
        ll.add(0,1);
        ll.add(1,2);
        ll.add(2,13);
        ll.add(3,14);
        ll.add(4,15);

      //  System.out.println(ll);
        ListIterator I1= ll.listIterator();
        int i=0;
        while (I1.hasNext())
        {
            if((Integer)ll.get(i)%2!=0)
            {
                I1.remove();
                i++;
            }
        }
          System.out.println(ll);
    }
}
