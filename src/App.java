import java.sql.*;
public class App {

    public static void main(String args[]){  
        try{  
        // Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3307/dbms", "root", "root");  
        //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from employee");  
        while(rs.next())  
        System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getInt(4));  
        con.close();  
        }catch(Exception e){ System.out.println(e);}  
        }  
        }  