package Intermediate.WorkingWithFiles;

public class Person {

    String name;
    String occupation;
    int age;

    public Person(String name, String occupation, int age)
    {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
    }

    public String toString()
    {
        return name +","+ occupation + ','+age;
    }


}
