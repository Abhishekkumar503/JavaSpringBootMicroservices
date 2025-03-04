import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ToInsertData {
    public static void main(String[] args) throws Exception {
        //declare initail variable with the values
        String url = "jdbc:mysql://localhost:3306/Test01";
        String userName = "root";
        String passWord = "Abhishek@1";
        // Query
        String query = "Insert into Student values(5,\"KAPIL\",26)";
        // Class for name
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establishing a connection
        Connection con = DriverManager.getConnection(url, userName, passWord);
        //Creating the statement
        Statement st = con.createStatement();
        //executing and storing the values with column name
        int rs = st.executeUpdate(query);
        System.out.println(rs+" Row/s Inserted");

        //closing the connections
        st.close();
        con.close();
    }
}
/*
OUTPUT
1 Row/s Inserted

 */