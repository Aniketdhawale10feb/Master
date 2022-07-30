package ExceptionHandeling;

public class FinallyBlock
{
    public static void main(String[] args) {
        try
        {
            System.out.println("trying to create null pointer and finally simultaneously");
            String AD= null;
            System.out.println(AD.length()/2);

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("example of null pointer exception");
        }finally {
            System.out.println("this is finally block code this will be executed even of the exception occurs and just after the catch ");
        }
    }
}
