import java.util.ArrayList;

class Patient {

    // private instance variables of the String type called name and illness
    private String name;
    private String illness;

    // private instance variable of the type ArrayList<Bill> with the name bills
    private ArrayList<Bill> bills = new ArrayList<Bill>();
    // private ArrayList<Bill> bills;

    // parameterized constructor that takes two values. The first should be a String
    // parameter to initialize the field name. The second parameter should be an
    // ArrayList<Bill> to initialize the field bills.
    public Patient(String name, ArrayList<Bill> bills) {
        this.name = name;
        this.bills = bills;
    }

    // getters and setters for name and illness
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    // method named addBill() that takes in a parameter of the Bill type and adds
    // the bill to the list bills using the add() method for ArrayList objects.

    public ArrayList<Bill> addBill(Bill bill) {
        bills.add(bill);
        return bills;
    }

    // overridden toString() method that returns the following String: "[Patient's
    // name = " + name + ", Patient's illness = " + illness + "]";
    @Override
    public String toString() {
        return "[Patient's name = " + name + ", Patient's illness = " + illness + "]";
    }

    // method named printBills() that prints the total value of all bills.
    public void printBills(/* ArrayList<Bill> bills */) {

        // create a total variable of type double and assign it an initial value of 0.
        double total = 0;

        // a for-each loop to iterate over bills:
        for (Bill bill : bills) {
            // for each bill, add the bill's amount to the total.
            double thisBillAmount = bill.getAmount();
            double subTotal = total;
            total = subTotal + thisBillAmount;
            // addBill(bill);
            //

            // double total = total + thisBillAmount;
            // double total.addBill(thisBillAmount);

            // still within the for-each loop, print the bill to the console using the
            // println() method
            System.out.println(bill);

        }

        // print the total value after the loop ends
        System.out.println(total);

    }

}