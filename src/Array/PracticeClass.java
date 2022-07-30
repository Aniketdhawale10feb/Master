package Array;

public class PracticeClass {
    int table2[] = {1, 2, 3, 4, 5, 6, 7, 8};


    public static void main(String[] args) {
        // defining array in Java one by one
        int table[] = new int[3];
        table[0] = 2;
        table[1] = 4;
        table[2] = 6;
        for (int i = 0; i <= table.length; i++) {
            System.out.println(table[i]);
        }
        System.out.println("size of the array is" + table.length);

        System.out.println("************************************************************************");
        //define array in one shot without creating reference
        int table2[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("The size of array 2 is " + table2.length);




    }
}

