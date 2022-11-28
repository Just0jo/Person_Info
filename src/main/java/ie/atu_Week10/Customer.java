package ie.atu_Week10;

public class Customer extends Person {
    private String CustomerNumber;
    private boolean MailingList;

    public Customer() {
    }

    public Customer(String name, String address, String number, String customerNumber, boolean mailingList) {
        super(name, address, number);
        this.CustomerNumber = customerNumber;
        this.MailingList = mailingList;

    }

    @Override
    public String toString() {
        return "" + super.toString() +
                "CustomerNumber='" + CustomerNumber + '\'' +
                ", MailingList=" + MailingList ;
    }
}









