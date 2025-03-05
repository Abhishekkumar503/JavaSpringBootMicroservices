import java.sql.*;

public class NewConnection {
    public static void main(String[] args) throws Exception {
        //declare initail variable with the values
        String url= "jdbc:mysql://localhost:3306/Test01";
        String userName="root";
        String passWord="Abhishek@1";
        // Query
        String query="select id from student where name=\"Udai\"";
        // Class for name
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establishing a connection
        Connection con= DriverManager.getConnection(url,userName,passWord);
        //Creating the statement
        Statement st =con.createStatement();
        //executing and storing the values with column name
        ResultSet rs=st.executeQuery(query);

        // to incremnet the pointer use
        rs.next();

        int id=rs.getInt("id");

        System.out.println(id);

        //closing the connections
        st.close();
        con.close();
    }
}

// jdbc:mysql://localhost:3306

/*
OUTPUT will be 1 or 2 ,its depend on database
 */
