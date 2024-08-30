import java.sql.*;
public class InsertData 
{
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "aniket@5867";

            Connection con = DriverManager.getConnection(url, username, password);

            //create a query
            String q = "insert into table1(tName,tCity) values (?,?)";

            //get the preparedStatement object
            PreparedStatement pstmt = con.prepareStatement(q);

            //set the values to query
            pstmt.setString(1, "Shivam Gudgal");
            pstmt.setString(2, "Ahmednagar");

            pstmt.executeUpdate();

            System.out.println("inserted data into a table");

            //close the connection
            con.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
