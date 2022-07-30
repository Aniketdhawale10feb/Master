package PracticeClass;

import java.util.Scanner;

public class NameReverseOrder
{

    public static void main(String[] args) {
        NameReverseOrder name= new NameReverseOrder();
        name.NameReverse();
    }

    void NameReverse()
    {
        System.out.println("Pleaee enter you fullname in NAME + MIDDLE-NAME + LAST-NAME format");
        Scanner sc = new Scanner(System.in);
        String fullName=sc.nextLine();
        int [] spaces = new int[2];
        char devider=' ';
        int index=0;
        for (int i= 0; i<=fullName.length()-1;i++)
        {

            char indChar= fullName.charAt(i);
            if(indChar==devider)
            {
                spaces[index]=i;
                //System.out.println(i);
                index++;
            }
        }
        int Firstspace= spaces[0];
        int SecondSpace= spaces[1];
        System.out.println(Firstspace);
        System.out.println(SecondSpace);

        String Firstname= fullName.substring(0,Firstspace);
        String Middlename= fullName.substring(Firstspace+1,SecondSpace);
        String LastName= fullName.substring(SecondSpace+1,fullName.length());

        System.out.println(LastName+" "+Middlename+" "+Firstname);

    }



}
