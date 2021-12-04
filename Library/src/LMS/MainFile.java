package LMS;

//Header Files
import java.io.*;
import java.util.*;
import java.sql.*;
class MainFile
{
  // Screen clear method
    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String args[]) throws Exception
    {
        System.out.println("\n\n\n--------* Welcome To IIITS Library *--------");
        FirstPage p = new FirstPage();
        Scanner sc = new Scanner(System.in);
        while(true)
        {   
            System.out.println("\n\n1. Admin Login\n2. Help\n3. Team Information\n4. Exit\n");
            System.out.printf("Enter your choice : ");
            try{
            int choice = sc.nextInt();
            // For Login
            switch(choice)
            {
                case 1:
                {   
                    clearScreen();
                    p.login();
                    break;
                }
                // Help
                case 2:
                    System.out.println("Help information \n");
                    break;
                // Team details
                case 3:
                    p.teamInfo();
                    break;
                case 4 :
                    {
                        sc.close();
                        return ;
                    }
                default:
                    System.out.println("Please enter valid choice ");
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter valid choice ");
            sc.next();
        }
        }
        }
        
    }
