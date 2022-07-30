package MethodOverriding;

public class ExecutionClass {

    public static void main(String[] args) {

        ChildClass child = new ChildClass();
        ParentClass parent = new ParentClass();
        SecondChild schild = new SecondChild();
        child.math(20, 8);
        parent.math(30, 22);
        schild.math(2, 5);
    }



}
