package StringStudy;

public class StringAddionalMethods extends StringInf{

    public static void main(String[] args) {
        StringInf inf= new StringInf();
        // Here we have used sub string method from string class to get the required sub string from STring Name1 from StringInf class
        System.out.println(inf.Name1.substring(3));
        System.out.println(inf.Name1.substring(3,5));

        // Here we will use the String to char array method to convert given string into char array

        char ch[]= inf.Name1.toCharArray();
        for (int i=0 ; i< ch.length; i++)
        {
         System.out.println(ch[i]);
        }
// Trim method is used to trim the leading or trailing spaces from the string
        System.out.println(inf.Name1.trim());
    }

}
