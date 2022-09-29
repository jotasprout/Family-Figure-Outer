import java.util.*;

public class FamilyMember {
    int ID = 0; // for any name conflicts
    String name;
    int age;
    String rel;
    String gender;
    HashMap<String, String> siblings = new HashMap<String, String>();

    // CONSTRUCTORS

    FamilyMember(String name, int age, String rel) {
        this.name = name;
        this.age = age;
        this.rel = rel;
    }

    FamilyMember() {
    };

    FamilyMember(String name) {
        this.name = name;
    }

    // GETTERS AND SETTERS

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID + 1;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String Rel) {
        this.rel = rel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is a " + age + "-year-old " + gender + " and your" + rel + ".";
    }
}