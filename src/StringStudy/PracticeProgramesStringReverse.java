package StringStudy;

import java.util.Scanner;

public class PracticeProgramesStringReverse {


    public static  void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to reveres");
        String s= sc.nextLine();

                for (int i=(s.length()-1);i>=0;--i)
                {
                    System.out.print(s.charAt(i));
                }

    }
    }

