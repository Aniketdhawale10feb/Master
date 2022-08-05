package PracticeClass;

public class DummyPractice
{

    public static void main(String[] args) {
        DummyPractice DM= new DummyPractice();
        DM.NameInReverse();
    }

    public void NameInReverse()
    {
        String Name="Aniket ankush dhawale";
        char Devider=' ';
        int [] spaces= new int[2];
        int Spacecount=0;

        for (int i=0; i<=Name.length()-1;i++)
        {
            if(Name.charAt(i)==Devider)
            {
                spaces[Spacecount]= i;
                Spacecount++;
            }
        }

        String FirstName= Name.substring(0,spaces[0]);
        String MiddleName= Name.substring(spaces[0]+1,spaces[1]);
        String Lastname= Name.substring(spaces[1]+1,Name.length());


        System.out.println(Lastname);
        System.out.println(FirstName);
        System.out.println(MiddleName);
    }

}
