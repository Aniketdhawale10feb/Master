package Array;

public class PracticeClass2 extends PracticeClass{

    public void findMin(int arrayone[])
    {
        int min = arrayone[0];
        for (int i = 1; i < arrayone.length; i++)
        {
            if (min > arrayone[i])
            {
                min = arrayone[i];
            }
        }
        System.out.println("The mininmum value is " + min);
    }
    public static void main(String[] args)
    {
        int FM[]={1143,333,66,3322,88,443};
        PracticeClass2 FND = new PracticeClass2();
        FND.findMin(FND.table2);
        FND.findMin(FM);

    }
}
