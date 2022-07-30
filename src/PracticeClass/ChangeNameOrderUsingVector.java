package PracticeClass;

import java.util.Scanner;
import java.util.Vector;

public class ChangeNameOrderUsingVector {

    public static void main(String[] args)

    {
        ChangeNameOrderUsingVector chnage= new ChangeNameOrderUsingVector();
        chnage.ChnageNameOrderByVector(' ');
    }

public void ChnageNameOrderByVector(char Devider){

        try {
            String name;
            Devider = ' ';
            Vector v = new Vector();
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();

            for (int i = 0; i <= name.length() - 1; i++) {

                if (name.charAt(i) == Devider) {
                    v.addElement(i);
                }
            }

            System.out.println(v);

            int firstSpace = (int) v.elementAt(0);
            int secondSpace = (int) v.elementAt(1);

            System.out.println(firstSpace);
            System.out.println(secondSpace);

            String FirstName = name.substring(0, firstSpace);
            String MiddleName = name.substring(firstSpace + 1, secondSpace);
            String LastName = name.substring(secondSpace + 1, name.length());

            System.out.println(FirstName);
            System.out.println(MiddleName);
            System.out.println(LastName);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
}


}




