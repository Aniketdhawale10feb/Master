package Encapsulation;

public class Bank {
    // To achieve encapsulation we have set the methods or variables of the class to private
    // and access the private varaibles from child class we need to use "Getter" methods
    // to set the values of the private variables we have to use setter variables.

    private int age;
    private int Balance;
    private int interestRate;


    public void setAge(int age) // setter method
    {
        if(age>=18 && age<=60) {
            this.age=age;}
        else {
            System.out.println("Please entre the age value between 18 ang 60");
        }
    }
    public void setBalance(int Balance) // setter method
    {
        if(Balance>=500 && Balance<=10000000){
        this.Balance= Balance;}
        else{
            System.out.println("Account balance minimum limit is 500 and maximum limit is 10000000 ");
        }
    }
    public void setInterestRate(int interestRate) // setter method
    {
        if(interestRate>8 && interestRate<15){
        this.interestRate= interestRate;}
        else
        {
            System.out.println("Interest rate should be between 8 and 15 percent");
        }
    }

    public int getAge(){
        return age;
    }
    public int getBalance(){
        return Balance;
    }
    public int getInterestRate(){
        return interestRate;
    }

}
