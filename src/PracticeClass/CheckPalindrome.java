package PracticeClass;

import org.bouncycastle.math.ec.ScaleXNegateYPointMap;
import org.w3c.css.sac.ElementSelector;

import javax.print.DocFlavor;
import java.util.Scanner;

public class CheckPalindrome
{
    public static void main(String[] args)
    {
        CheckPalindrome chk= new CheckPalindrome();
        chk.palinCheck();
    }

    public void palinCheck() {

        System.out.println("Please enter a number of String to check the palindrome");
        Scanner sc= new Scanner(System.in);
        String Name= sc.nextLine();

        StringBuffer Name2= new StringBuffer("aniket");

        //System.out.println(String.valueOf(Name2.reverse()));
        //System.out.println(Name);

        String ReversedName= String.valueOf(Name2.reverse());
        System.out.println(ReversedName);

        if (Name.equalsIgnoreCase(String.valueOf(ReversedName)));
        {
            System.out.println("The number is a Palindrome");
        }
    }
}


