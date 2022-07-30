package Interface;

public class Execution {

    public static void main(String[] args)
    {
        impleClass1 exe1 = new impleClass1();
        ImpleClass2 exe2 = new ImpleClass2();
        exe1.companyName();
        exe1.department();
        exe1.employeeCount();
        exe1.salary();
        exe1.countryname();

        System.out.println("**************************************************888");

        exe2.companyName();
        exe2.department();
        exe2.employeeCount();
        exe2.salary();
        exe2.countryname();

    }

}
