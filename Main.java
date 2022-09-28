import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        ~~~~~ Ye Olde Introduction ~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("I am an amazing application that can figure out how people are related to you.");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        ~~~~~ Ye Olde Instructions ~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        System.out.println("First, some questions about you.");

        // YOU
        System.out.println("What's your name?");
        String yourName = scan.next();

        System.out.println("What's your gender?");
        String yourGender = scan.next();

        System.out.println("What's your age?");
        int yourAge = scan.nextInt();

        FamilyMember me = new FamilyMember(yourName);
        me.setGender(yourGender);
        me.setAge(yourAge);
        me.setRel("self ");

        // YOUR MOTHER
        System.out.println("What is your mother's name?");
        String momName = scan.next();

        System.out.println("What's your mother's age?");
        int momAge = scan.nextInt();

        FamilyMember mom = new FamilyMember(momName);
        mom.setGender("female");
        mom.setAge(momAge);
        mom.setRel("mother");

        // YOUR FATHER
        System.out.println("What is your father's name?");
        String dadName = scan.next();

        System.out.println("What's your father's age?");
        int dadAge = scan.nextInt();

        FamilyMember dad = new FamilyMember(dadName);
        dad.setGender("male");
        dad.setAge(dadAge);
        dad.setRel("father");

        String myself = me.toString();
        System.out.println(myself);

        String myDad = dad.toString();
        System.out.println(myDad);

        String myMom = mom.toString();
        System.out.println(myMom);

        scan.close();
    }
}