package Interface;

public class impleClass1 implements inter{


    public void companyName() {
        System.out.println("company name in Lentra");
    }

    public void employeeCount() {
        System.out.println("Total number of employees are 450");
    }

    public void department() {
        System.out.println("The department is IT");
    }

    public void salary() {
        System.out.println("Salary of IT depart ment employees is in between 300000 to 3400000");
    }

    public void countryname() // method from parent interface
    {
        System.out.println(inter.country);
    }
}
