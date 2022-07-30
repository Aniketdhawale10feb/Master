package StringStudy;

import javax.swing.*;

public class StringBufferClass {


    // String buffer class is used when we want to modify the string as per our requirement
    // String create using only string class can not be modified
    public static void main(String[] args) {

        StringBuffer Name= new StringBuffer("Aniket");
        StringBuffer sirname = new StringBuffer("Dhawale");


         System.out.println("Here we have appended 'Sirname' string in Name string (Aniket)");
         StringBuffer fullname= Name.append(sirname);// append method from StringBuffer class
         System.out.println(fullname);


         System.out.println("Here we have inserted 'Insert' string in Name string (Aniket) at zeroth index");
         StringBuffer fullname1 = Name.insert(0,"Insert");
         System.out.println(fullname1);

         System.out.println("Here we have replaced 'Replace' string in Name string (Aniket) indexes ranging from 0 to 2 (except 2th index)))");
         StringBuffer fullname2= Name.replace(0,2,"replace");
         System.out.println(fullname2);

         System.out.println("Here we have deleted indexes from 0 to 2 from Name string (Aniket) (including 2th index)");
         StringBuffer fullname3= Name.delete(0,2);
         System.out.println(fullname3);

         System.out.println("Here we have reversed the string Name using reverse method from string buffer class");
         StringBuffer fullname4 = Name.reverse();
         System.out.println(fullname4);
    }


}
