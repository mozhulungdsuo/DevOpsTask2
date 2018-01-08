package program11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class H2Example {
	public static void main(String[] args)
	{
	String url="jdbc:h2:tcp://localhost/~/DEV";
	String username="sa";
	String pass="";
	String query="select * from student";
	ArrayList <String> al=new ArrayList<String>();
	
	
	try(Connection con=DriverManager.getConnection(url,username,pass);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query))
	{
		while(rs.next()) {
			String col1=rs.getString(1);
			String col2=rs.getString(2);
			al.add(col1);
			al.add(col2);
			
		}
	
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Iterator<String> itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
	}
	


