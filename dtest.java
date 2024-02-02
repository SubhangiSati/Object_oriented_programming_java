package jdbc;
//Put a string "requires java.sql;" in the module-info.java file
import java.sql.*;
public class dtest {
	public static void main(String args[])
	{
		try{
			Class.forName(" com. mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysq180","root", "admin@123");
			Statement stmt=con.createStatement();
			Statement stmt= con.cre
			ResultSet rs= stmt.executeQuery ("select * from b3.emp");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			//con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}