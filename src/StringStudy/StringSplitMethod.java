package StringStudy;

public class StringSplitMethod extends StringInf{

    public static void main(String[] args) {

        StringInf inf= new StringInf();
        String rev[] = inf.Name1.split("");


        for (int i=(rev.length-1); i>0; i--)
        {
            System.out.println(rev[i]);
        }

        System.out.println(inf.Name1.startsWith("D"));
        //Starts with method


    }

}
