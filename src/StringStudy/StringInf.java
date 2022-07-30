package StringStudy;

public class StringInf {
    /* there are two ways to define a string, 1st by using the tsring keyword only
    2nd by using the object creation method
     */
    //Method 1 exmaple
    String Name1= "Aniket Dhawale              ";
    String Name2= "aniket dhawale";

    //Method 2 example
    String Name3 = new String("Aniket");
    String Name4= new String("");

    /* The diffrence in above mentioned menthods are in
    1st method
    The value id same for Name1 and Name2 so the value will be stored in only one place in memory
    but just the references will be diffrent.

    2nd Method
    The value of Name3 and Name4 both are same but still both objects will have diffrent memory locations
     */

    public boolean compare ()
    {
        Boolean status = Name3.equals(Name4);
        System.out.println(status);
        return status;
    }

}
