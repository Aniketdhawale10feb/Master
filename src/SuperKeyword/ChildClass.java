package SuperKeyword;


// Super keyword is used to access method , variable or constructor of a direct 1st parent class in the child class
public class ChildClass extends ParentClass {

    public void access(){

        String variable= super.SPVariable;
        System.out.println(variable); // Here we accessing the variable from parent class directly using super keyword
        super.SPmethod();// Here we accessing the Method from parent class directly using super keyword
    }

    public static void main(String[] args) {
        ChildClass met = new ChildClass();
        met.access();
    }

}
