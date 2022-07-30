package MethodOverriding;

public class ChildClass extends ParentClass {

    public void math(int a, int b) {
        System.out.println("Substraction in math of " + a + " and " + b);
        int c = a - b;
        System.out.println(+c);
    }


}



