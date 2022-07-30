import java.util.Scanner;

import static org.apache.commons.math3.primes.Primes.isPrime;

public class PrimenumberPractice {

  /*  public static void main(String[] args) {
        System.out.println("Please enter the Number");
        Scanner sc = new Scanner(System.in);
        int a= Integer.parseInt(sc.nextLine());

        if (a%2==0 && a!=2){
            System.out.println(a+ "is NOT PRIME NUMBER");
        }
        else {
            System.out.println(a+" is  PRIME NUMBER ");
        }
*/

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number");
        int a= Integer.parseInt(sc.nextLine());
        Boolean b;
        if (isPrime(a)){
            b = true;
            System.out.println(b);
        }else {
            b= false;
            System.out.println(b);
        }
    }

}

