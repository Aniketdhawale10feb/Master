package ExceptionHandeling;

import java.util.logging.Logger;

public class TryCatch
    //Try catch ic used to handle the exception in Java, unchecked exceptions
   // here we thave tried to create a Arithmatic exception by deviding A by zerp
    // And the code which is expected to give the exception is mentioned inside the try block
    // and in response to the exception further logic is written in catch block
{
    public static void main(String[] args) {
        try {
            System.out.println("Tryinh to create Arithmatic exception");
            int A = 12;
            int B = A / 0;
            System.out.println(B);
        } catch (Exception e) {
            System.out.println("Please don't devide A by Zero");
            e.printStackTrace();
        }

        // lets create a null pointer exception by performing some operation on null value vriable
        try {
            System.out.println("Trying to create null pointer exception");
            String Name = null;
            System.out.println(Name.length());
        } catch (Exception e) {
            System.out.println("please set the value for Name 1st its curent value is null");
            e.printStackTrace();
        }
    }
}
