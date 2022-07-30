package Encapsulation;

public class HDFCBank extends Bank {

    public static void main(String[] args)
    {
        Bank loan = new Bank();

        loan.setAge(18);// called set methods to set the values
        loan.setBalance(100000);
        loan.setInterestRate(12);

        System.out.println("**********************************************************************");

        System.out.println("aget is: " +loan.getAge()); // called get method to access the value
        System.out.println("balance is : "+loan.getBalance());
        System.out.println("interest rate is ; "+loan.getInterestRate());
    }



}
