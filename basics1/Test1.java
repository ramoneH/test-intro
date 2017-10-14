package basics1;

	import java.sql.*;
import java.util.Calendar;  
	class Test1{  
	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/footballdb","root","Carl1217");  
	//here sonoo is database name, root is username and password  
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from pbp2017");  
	while(rs.next())  
	System.out.println(rs.getString(7) + "  "+rs.getString(8)+"  "+rs.getString(14));  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	  public static void savetotable(String[] args)
	  {
	    try
	    {
	      // create a mysql database connection
	      String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://localhost:3306/";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "");
	    
	      // create a sql date object so we can use it in our INSERT statement
	      Calendar calendar = Calendar.getInstance();
	      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

	      // the mysql insert statement
	      String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
	        + " values (?, ?, ?, ?, ?)";

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setString (1, "Barney");
	      preparedStmt.setString (2, "Rubble");
	      preparedStmt.setDate   (3, startDate);
	      preparedStmt.setBoolean(4, false);
	      preparedStmt.setInt    (5, 5000);

	      // execute the preparedstatement
	      preparedStmt.execute();
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	  }
	}
	
