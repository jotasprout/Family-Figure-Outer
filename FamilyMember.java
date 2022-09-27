import java.util.ArrayList;

public class FamilyMember 
{
    private String name;
    private String age;

    private ArrayList<Siblings> siblings = new ArrayList<Siblings>();
    
    public FamilyMember(String name, int age, String rel)
    {
        this.name = name;
        this.age = age;
        this.rel = rel;
    }
}