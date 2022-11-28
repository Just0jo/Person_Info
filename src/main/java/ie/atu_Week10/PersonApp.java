package ie.atu_Week10;

public class PersonApp {
    public static void main(String[] args) {
        Person myInfo = new Person();
        myInfo.setAddress("Glasan");
        myInfo.setName("Praise");
        myInfo.setNumber("0899");
        System.out.println("here are my details " + myInfo.toString());
    }
}
