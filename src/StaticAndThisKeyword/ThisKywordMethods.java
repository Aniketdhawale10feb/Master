package StaticAndThisKeyword;
/* this keyword can be used with the methods as well to specify any
method as the method from same class
 */
public class ThisKywordMethods extends ThisKeyword {

    public void Data(int a,String Name)
        {
            System.out.println(a + "name");
        }


    public void main(String[] args) {
        ThisKywordMethods dat = new ThisKywordMethods();
        this.Data(10, "name");
        dat.Data(12,"aniket");
    }


}
