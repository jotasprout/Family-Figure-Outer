import java.util.*;

public class FamilyMember {
    String name;
    int age;
    String rel;
    String gender;

    private HashMap<String, String> siblings = new HashMap<String, String>();

    // CONSTRUCTORS

    FamilyMember(String name, int age, String rel) {
        this.name = name;
        this.age = age;
        this.rel = rel;
    }

    FamilyMember() {
    };

    FamilyMember(HashMap<String, String> siblings) {
        this.siblings = siblings;
    };

    FamilyMember(String name) {
        this.name = name;
    }

    // GETTERS AND SETTERS

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HashMap getSiblings() {
        return siblings;
    }

    public void setSiblings(HashMap siblings) {
        this.siblings = siblings;
    }

    @Override
    public String toString() {
        return "Your name is " + name + ", you're a " + age + "-year-old " + gender + ".";
    }
}