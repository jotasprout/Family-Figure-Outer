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

        // FamilyMember me = new FamilyMember();
        System.out.println("What's your name?");
        String yourName = scan.next();

        System.out.println("What's your gender?");
        String yourGender = scan.next();

        System.out.println("What's your age?");
        int yourAge = scan.nextInt();

        FamilyMember me = new FamilyMember(yourName);
        me.setGender(yourGender);
        me.setAge(yourAge);

        String thisGuy = me.toString();
        System.out.println(thisGuy);

        scan.close();
    }
}