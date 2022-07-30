package StaticAndThisKeyword;

public class StaticMethod {
   static int i= 10;
    int j= 10;

    //Static Method
    public static void displayI(){
        System.out.println(i);
    }
    // Non-static Method
    public void displayJ(){
        System.out.println(j+i);
    }

    public static void main(String[] args) {

        StaticMethod.displayI();
        //static method can be called with just classname

        StaticMethod method= new StaticMethod();
        method.displayJ();
        //To call the non-static method user has to create an object of the class.
    }


}
