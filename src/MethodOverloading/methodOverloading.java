package MethodOverloading;

public class methodOverloading {

    /* Using the same method name to perform the diffrent operations just bychanging the number of parameteres or , return type
    is method overloading
    The Key factor here is we can use the same method name again and again, just with diffrent
    number of parameters or Return type
     */


        public void waiting ( int time)
        {
            System.out.println("Prashant didnt made me wait for " + time + " hours");

        }

        public void waiting ( int time, String name)
        {
            System.out.println(name + " made me wait for " + time + " hours");
        }

        public double waiting (double time, String name)
        {
            System.out.println(name + " made me wait for " + time + " hours");
            return time;
        }

}
