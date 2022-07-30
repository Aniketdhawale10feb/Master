package Array;

public class define {
    // defining array one by one
    public static void main(String[] args) {

        int arrayone[] = new int[4];// here arrayone is a array and int [5] is the size of array starting with 0 indexing
        arrayone[0]=10;
        arrayone[1]=20;
        arrayone[2]=30;
        arrayone[3]=30;

        System.out.println("**********************************************************************************");
        System.out.println("The size of array one is "+ arrayone.length);
        System.out.println("3rd value in array arrayone is "+ arrayone[2]);
        System.out.println("**********************************************************************************");

        //defining in one shot
        String arraytwo[]={"a","b","c","d","e","f","g","h"};
        System.out.println("The size of array two is "+ arraytwo.length);
        System.out.println("the 4th character in ABCD alphabets is "+arraytwo[3]);
        System.out.println("**********************************************************************************");

    }



}
