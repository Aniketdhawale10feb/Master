package ExceptionHandeling;

public class NestedTryCatch
{
    //lets create nested try catch programe
    public static void main(String[] args)
    {
        try
        {
            int A[] = {1, 2, 3, 4};
            System.out.println(A[2]);
            try
            {
             String b="Aniket";
             int c=12;
             int d=b.length()/c;
                System.out.println(d);
              try
              {
              int e= c/2;
                  System.out.println(e);
              } catch (Exception e)
              {

                 System.out.println("This is n example of arithmatic exception");
                 e.printStackTrace();
              }
            }catch(Exception e)
            {
                System.out.println("Thisis an example of null pointer exception");
                e.printStackTrace();
            }
        }catch(Exception e)
        {
            System.out.println("This is the example of array out of bound exception");
            e.printStackTrace();
        }
    }
}
