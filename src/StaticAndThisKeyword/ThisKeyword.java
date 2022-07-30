package StaticAndThisKeyword;


/* This Keyword is used to specify the particular variable or method belongs to the same class */
/* In the following example we have 2 same set of variables age and Name*/
/* one is defined under the class "ThisKeyword" and another is defined under the method "data*/
/* now while using the same variable in logic we need to specify which variable we wanted to consider class level
 of method level variable*/
/* so to define any variable as a class level variable in this situation we need to use "this" keyword*/
/* in the following example under a method data we have specified that "this.age" and "this.name"belongs
class level variables , same is also applied with methods */

public class ThisKeyword {
    int age;
    String name;

    public void Data (int age,String name)
    {
        this.age= age;
        this.name= name;

        System.out.println(name+ " is "+age+" Years old ");
    }

    public void main(String[] args) {
        ThisKeyword info = new ThisKeyword();
        info.Data(23,"Aniket");
    }


}
