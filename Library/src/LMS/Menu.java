package LMS;

import java.util.*;
import java.sql.*;

class Menu
{
    Scanner sc= new Scanner(System.in);
    public void searchBook()
    {
        
    }
    public void addBook() throws SQLException
    {
        String title = sc.nextLine();
        String authorName = sc.nextLine();
        String Bid = sc.nextLine();
        int price = sc.nextInt();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NameOfDatabase","root","root");
        Statement stmt = con.createStatement();
        String s = " insert into Student values(\""+title+"\",\""+authorName+"\","+Bid+","+price+");";
        //  String s = " insert into Student values(?,?,?,?)";
        //  PreparedStatement ps = connection.prepareStatement(s);
        //  ps.setString(1,title);
        //  ps.setString(2,authorName);
        //  ps.setInt(3,Bid);
        //  ps.setDouble(4,price);
        //  ps.executeUpdate();
        stmt.execute(s);
        con.close();
    }
    public void deleteBook() throws SQLException
    {
        int Bid=sc.nextInt();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NameOfDatabase","root","root");
        Statement stmt = con.createStatement();
        String s = " delete from Student where Bid=" + Bid + "\"";
        stmt.execute(s);
        //  String s = " delete from Student where Bid=? ";
        //  PreparedStatement ps = connection.prepareStatement(s);
        //  ps.setInt(1,Bid);
        //  ps.executeUpdate();
        con.close();
    }
    public void returnBook()
    {
        
    }
    public void displayFine()
    {
        
    }
}