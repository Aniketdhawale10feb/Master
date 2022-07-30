package PracticeClass;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameReverseOrderUsingSplitFunction
{
    public static void main(String[] args)
    {
        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Please enter Your full name");
        String Fullname = sc.nextLine();

        String[] array= Fullname.split(" ");
        System.out.println(Arrays.toString(array));

        String Firstname = array[0].toString();
        String Middlename = array[1].toString();
        String Lastname = array[2].toString();

        String ReversedName= Lastname+" "+ Firstname +" "+Middlename;
        System.out.println(ReversedName);

    }

}
