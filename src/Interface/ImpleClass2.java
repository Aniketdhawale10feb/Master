package Interface;

public class ImpleClass2 implements inter{

    public void companyName() {
        System.out.println("Company name is TCS");
    }

    public void employeeCount() {
        System.out.println("Company has 2000 employees");
    }

    public void department() {
        System.out.println("department name is accounts");
    }

    public void salary() {
        System.out.println("the average salary of employee is 600000");
    }

    public void countryname() // method from Parent interface
    {
        System.out.println(inter.country);
    }
}
