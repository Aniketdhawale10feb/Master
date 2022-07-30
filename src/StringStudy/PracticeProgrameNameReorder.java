package StringStudy;


public class PracticeProgrameNameReorder {

    public static void main(String[] args)
    {
        StringBuffer fullName =new StringBuffer("aniket ankush dhawale") ;
        char DeviderValue= ' ';
       // StringBuffer Rev=fullName.reverse();
        //System.out.println(Rev);
        String stString  = fullName.substring(0,6);
        System.out.println(stString);

    }
    
/*
    public Array[] getDeviders() {
        for (int i = 0; i < fullName.length(); i++) {

            System.out.println(fullName.split(" (?!.* )")[i]);
            if (fullName.charAt(i) == DeviderValue) {
                System.out.println(i);
            }
        }
    }
*/
}
