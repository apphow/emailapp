import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Email {

    Scanner scanner = new Scanner(System.in);
    // use encapsulation so outside classes can't access directly
    // we'll access this class through our class API's
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive the firstname and lastName
    public Email(String firstName, String lastName) {
        this.firstName = firstName; // class level (this)
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department and return that department
        this.department = setDepartment();
        System.out.println("Department is : " + this.department);

    }

    private String setDepartment() {
        // Ask for the department
        System.out.println("DEPARTMENT CODES: Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none. ENTER THE DEPARTMENT CODE.");
        int departmentResponse = scanner.nextInt();
        if(departmentResponse == 1) {
            return "Sales";
        }if(departmentResponse == 2) {
            return "Development";
        } if(departmentResponse == 3) {
            return "Accounting";
        }
        return "No department entered.";
    }
}



    // Generate a random password

    // Set the mailbox capacity

    // Set the alternate email

    // Change the password
