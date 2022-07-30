package Interface;

// interface is the entity in java which only contain the abstract methods.
// all methods inside the interface ar by default abstract methods , no need to mention abstract keyword
// interface accepts only the final defined variables
// interface can extend another interface
// It is not possible to create an object of interface
// To implement the methods of interface in another class, we need to implement the interface in that class using implement keyword
// The class implementing the interface should implement all the methods present inside the interface
// Inheritance is possible in case of interfaces, child interface can extend parent interface
// If any class implements the child interface, it must implement all the methods of parent interface also
public interface inter extends ParentInter
{
    final String country = "India"; // final defined variable in interface
    public void companyName();
    public void employeeCount();
    public void department();
    public void salary();
}
