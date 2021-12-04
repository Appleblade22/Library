package LMS;

import java.io.*;
import java.util.*;
import java.sql.*;

public class FirstPage {
    public void teamInfo() {
        System.out.println(
                "\n\n* TEAM LEADER *\n\nMEET JAIN\t  S20200010126\n\n* TEAM MEMBERS *\n\nANAND THAKUR\t  S20200010016\nNEHUL SINGH\t  S20200010144\nSAURABH KUMAR\t  S20200010190\nJAYANTH KORRA\t  S20200010101");
    }

    public void menu() {
        Menu m = new Menu();
        while (true) {
            System.out.println("1. Search Book");
            System.out.println("2. Add Book"); // Category,name,BID,author,category,price
            System.out.println("3. Delete Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display fine");
            System.out.println("6. Exit");
            System.out.printf("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        m.searchBook();
                        break;
                    case 2:
                        m.addBook();
                        break;
                    case 3:
                        m.deleteBook();
                        break;
                    case 4:
                        m.returnBook();
                        break;
                    case 5:
                        m.displayFine();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Please enter valid choice ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid choice ");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void login() {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            final String user = new String("admin");
            final String pass = new String("admin");
            System.out.println("\n\n       ----------* Welcome To IIITS Library *----------");
            System.out.printf("\n\n\n\t\t         Login Page");
            System.out.printf("\n\t\t      --------*--------");
            System.out.printf("\n\n\t\t      Username = ");
            String temp_user = sc.next();
            System.out.printf("\n\t\t      Password = ");
            String temp_pass = sc.next();
            System.out.println("\n\nChecking Validity of username and Password Please Wait");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            ;
            if (user.equals(temp_user) && pass.equals(temp_pass)) {
                System.out.println("\nLogin SuccessFul");
                menu();
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
        System.out.println("\nLogin Failed");
        return;
    }
}
