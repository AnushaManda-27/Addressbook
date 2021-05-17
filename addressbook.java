public class addressbook {    
    private final String firstname;
    private final String lastname;
    private final String address;
    private final String city;
    private final String state;
    private final int zip;
    private final String phonenumber;
    private final String email;
public addressbook(String firstname, String lastname, String address, String city, String state, int zip, String phonenumber, String email) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phonenumber = phonenumber;
        this.email = email;
}
public void contactslist( ) {

        System.out.println("firstname: " +firstname);
        System.out.println("lastname: " +lastname);
        System.out.println("address: " +address);
        System.out.println("city: " +city);
        System.out.println("state: " +state);
        System.out.println("zip: " +zip);
        System.out.println("phonenumber: " +phonenumber);
        System.out.println("email: " +email);

}

public static void main(String[] args) {
        addressbook Anusha = new addressbook("Anusha", "Manda", "LBnagar", "HYD", "Telangana", 500028, "9876543210", "anushamanda27@gmail.com");
        Anusha.contactslist();
        System.out.println(Anusha);

}

}
