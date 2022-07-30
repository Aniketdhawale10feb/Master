package MethodOverriding;

public class SecondChild extends ParentClass{

    public void math (int a, int b)
    {
        System.out.println("multiplication in math of " +a+ " and " +b);
        int c= a*b;
        System.out.println(+c);
    }
}
