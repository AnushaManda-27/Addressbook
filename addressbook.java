import java.util.Scanner;

public class AddressBookDetails {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     AddressBook add[] = new AddressBook[10];
         int count = 0;
         String firstname;
         String lastname;
         String address;
         String city;
         String state;
         String zip;
         String phonenumber;
         String email;
         int choice = 0;
         
         do {
        	 System.out.println("1.Add Detail 2.Update Details 3.Delete Details 4.Show all Details");
        	 System.out.println("Enter your choice");
        	 choice = sc.nextInt();
        	 
        	 switch(choice) {
        	 
        	 case 1:
        		 System.out.println("Enter how many address details you want to add");
        	     int num = sc.nextInt();
        	     for(int i = 0;i < num; i++) {
        	    	 System.out.println("Enter first and last name");
        	    	 firstname = sc.next();
        	    	 lastname = sc.next();
        	    	 System.out.println("Enter Address");
        	    	 address = sc.next();
        	    	 System.out.println("Enter City");
        	    	 city = sc.next();
        	    	 System.out.println("Enter State");
        	    	 state = sc.next();
        	    	 System.out.println("Enter ZIP");
        	    	 zip = sc.next();
        	    	 System.out.println("Enter PhoneNumber");
        	    	 phonenumber = sc.next();
        	    	 System.out.println("Enter Email");
        	    	 email = sc.next();
        	    	
        	    	 add[count] = new AddressBook(firstname, lastname, address, city, state, zip, phonenumber, email);
        	         }
        	         count++;
        	         System.out.println("Details added successfully");
        	         break;
        	         
        	         case 2:
        	        	 System.out.println("Update Details");
        	        	 System.out.println("Enter Phone number which you want to update");
        	        	 phonenumber = sc.next();
        	        	 for(int i = 0; i < count; i++) {
        	        		 if(add[i] != null && add[i].getPhoneNumber() == phonenumber) {
        	        			 System.out.println("Enter first name and last name");
        	        			 firstname = sc.next();
        	        			 add[i].setFirstName(firstname);
        	        			 
        	        			 lastname = sc.next();
        	        			 add[i].setLastName(lastname);
        	        			 
        	        			 System.out.println("Enter Address");
                    	    	 address = sc.next();
                    	    	 add[i].setAddress(address);
                    	    	 
                    	    	 System.out.println("Enter City");
                    	    	 city = sc.next();
                    	    	 add[i].setCity(city);
                    	    	 
                    	    	 System.out.println("Enter State");
                    	    	 state = sc.next();
                    	    	 add[i].setState(state);
                    	    	 
                    	    	 System.out.println("Enter ZIP");
                    	    	 zip = sc.next();
                    	    	 add[i].setZIP(zip);
                    	    	 
                    	    	 System.out.println("Enter PhoneNumber");
                    	    	 phonenumber = sc.next();
                    	    	 add[i].setPhoneNumber(phonenumber);
                    	    	 
                    	    	 System.out.println("Enter Email");
                    	    	 email = sc.next();
                    	    	 add[i].setEmail(email);
                    	    	
        	        		 }
        	        	 }
        	        	 System.out.println("Details Updated");
        	        	 break;
        	        	 
        	       case	3:
        	    	   System.out.println("Delete Details");
        	    	   
        	    	   System.out.println("Enter Phone Number of contact which you have to delete from AddressBook ");
        	    	      phonenumber = sc.next();
      	        	      for(int i = 0; i < count; i++) {
      	        		     if(add[i] != null && add[i].getPhoneNumber() == phonenumber) {
      	        			   add[i] = null;
      	        		     }
      	        	     }
      	        	    System.out.println("Details Deleted Successfully");
      	        	    break;
      	        	    
        	       case	4:
        	    	   System.out.println("All Details");
        	    	   
      	        	      for(int i = 0; i < count; i++) {
      	        	    	System.out.println(add[i]);
      	        	      }
      	        	      break;
      	        	      
      	            default :
      	            	System.out.println("you entered invaild choice");
        	        }
         }	 
        while (choice!=0);
		}
        	 
	
}
