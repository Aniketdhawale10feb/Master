package StringStudy;

public class StringConcatinate extends StringInf
{
    public static void main(String[] args) {
        StringInf STR= new StringInf();

        System.out.println("String Concatination with '+' operator");
        //String Concatination with + operator
        String Con= STR.Name1+" "+STR.Name2+" "+STR.Name3+" "+STR.Name4;
        System.out.println(Con);

        System.out.println("*****************************************************************8");

        System.out.println("String Concatination with '.concat()' Method");
        //String Concatination with'.concat()' Method
        String Con1= STR.Name1.concat(STR.Name2).concat(STR.Name3).concat(STR.Name4);
        System.out.println(Con1);

    }

}
