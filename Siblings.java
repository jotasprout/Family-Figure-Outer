import java.util.HashMap;

public class Siblings extends FamilyMember {

    HashMap<String, String> siblings = new HashMap<String, String>();

    public HashMap<String, String> getSiblings() {
        return siblings;
    }

    public void setSiblings(HashMap<String, String> siblings) {
        this.siblings = siblings;
    }

}
