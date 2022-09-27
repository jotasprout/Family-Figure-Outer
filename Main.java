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
        System.out.println();

        Scanner scan = new Scanner(System.in);

        // FamilyMember me = new FamilyMember();
        System.out.println("What's your name?");
        String yourName = scan.next();

        System.out.println("What's your gender?");
        String yourAge = scan.next();

        System.out.println("What's your age?");
        String yourGender = scan.next();

        System.out.println("Your name is " + yourName + ", you're a .");
        // me.put(name, yourName);
        FamilyMember me = new FamilyMember(yourName);
        System.out.println("Your name be " + me.name + ".");
        scan.close();

    }
}