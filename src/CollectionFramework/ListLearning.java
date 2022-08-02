package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListLearning
{
    public static void main(String[] args) {
        ListLearning LL= new ListLearning();
        LL.ArraylistPrac();
    }

    public void ArraylistPrac() {
        List AL1 = new ArrayList();
        AL1.add(0,1);
        AL1.add(1,12);

        System.out.println(AL1);

        List AL2= new ArrayList();
        AL2.add(0,11);
        AL2.add(1,22);
        AL2.add(2,33);
        AL2.add(3,44);
        AL2.add(4,55);
        System.out.println(AL2);
// add all function we have used this to add AL@ in AL! at o'th ondex
        AL1.addAll(0,AL2);
        System.out.println(AL1);

// set function is used to set a value of a particular object in AL1 at specified index
        AL1.set(1,"Set selement");
        System.out.println(AL1);

// we have removed the value object at 2 index in AL1
        AL1.remove(2);
        System.out.println(AL1);

// sublist is used to create the sublist out of existing list AL1
        List AL3= new ArrayList();
        AL3= AL1.subList(1,4);
        System.out.println(AL3);

//This is used to get the value of the object with specified index AL1
        System.out.println(AL1.get(4));
    }
}
