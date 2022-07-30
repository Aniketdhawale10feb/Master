package MethodOverriding;

public class ParentClass {

    /* Here we have written same method "math" in all classes but every method has its own logic
    same is achieved using the inheritance of parent and child classes
    and in execution class all methods are called but during run time java is deciding which logic to execute
    for same method under diffrent classes
     */

    public void math (int a, int b)
    {
        System.out.println("Addition in math of "+a+" and " +b);
        int c=a+b;
        System.out.println(+c);
    }
}

