package StaticAndThisKeyword;

import jdk.swing.interop.SwingInterOpUtils;

public class StaticKeyword {

    //Static keyword is used to define any Variable, Method specific to the respective class.
    //The variable or method created with static keyword can ly be called with class name
    //Static variables are only initialised once when the class is called.
    //non-static variables or methods are initialised every time when the object of class is created
    // Please refer the Eg. given below


    static int i= 10;
    int j= 10;

    public StaticKeyword (){
        i++;
        j++;
    }

    public static void main(String[] args) {

            System.out.println("The value of static variable i is   " + StaticKeyword.i);
            // Here you can observe that for static variable user does not need to create an object

            StaticKeyword word = new StaticKeyword();
            System.out.println("The value of non static Variable J is " + word.j);
            //To call the non-static variable user has to create a object of a class.

    }


}
