import java.sql.*;
class InsertJDBC
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			//creating connection
			
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="aniket@5867";

			Connection con=DriverManager.getConnection(url, username, password);

			//create a query 

			String q="create table if not exists table1 (tId int(20) primary key auto_increment,tName varchar(200) not null , tCity varchar(400))";

			//create a statement 
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table created in database ... ");
			con.close();


			 /*check into a database if table is created or not 
			  * desc is the commant to check the table  attributes is created or not 
			  desc Table_Name;
			  */

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}