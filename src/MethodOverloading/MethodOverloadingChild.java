package MethodOverloading;

public class MethodOverloadingChild extends methodOverloading {
    public static void main(String[] args) {
        methodOverloading nice = new methodOverloading();
        nice.waiting(2);
        nice.waiting(1 ,"Aniket");
        nice.waiting(1.5,"Mrunal");
    }
}