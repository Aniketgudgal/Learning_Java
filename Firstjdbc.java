import java.sql.*;
class Firstjdbc
{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String  url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="aniket@5867";
            Connection con=DriverManager.getConnection(url,username,password);
            if(con.isClosed())
            {
                System.out.println("Connection is Closed");
            }
            else
            {
                System.out.println("Connection Created..");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}