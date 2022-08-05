package PracticeClass;

public class FindVowels
{
    String Name= "aniket";
    String Vovwel="aeiou";

    public static void main(String[] args) {
        FindVowels f= new FindVowels();
        f.checkCountVowel();

    }


    public  void checkContainVowel()
    {
        boolean Condition= Name.contains("a")||Name.contains("e")||Name.contains("i")||Name.contains("o")||Name.contains("u");
        System.out.println(Condition);
    }

    public void checkCountVowel()
    {
int total=0;
        for(int i=0; i<=Vovwel.length()-1;i++)
        {   int count=0;
            char vo= Vovwel.charAt(i);

            for (int j=0;j<=Name.length()-1;j++){
                char N=Name.charAt(j);
                if(vo==N)
                {
                    count++;
                    total++;
                }
            }
            System.out.println("The count of Vovel "+vo+" is "+ count);
        }
        System.out.println("The total vowel count is "+total);

        if(total>0)
        {
            System.out.println("The etered word contains atleast one vowel ");
        }
        else {
            System.out.println("The entered word does not contain any vowel");
        }
    }
}
