package AbstractiClass;

public class CHILD2 extends ABS
{
    public void house()// implementing same method of abstract class in another child class
    {
        System.out.println("Farm house is a home in farm");
    }

    public static void main(String[] args)// calling all implementations of abstract class methods
    {
        ABS ch= new CHILD();
        ABS ch2= new CHILD2();
        ch.house();
        ch2.house();
        ch.flat();
    }
}