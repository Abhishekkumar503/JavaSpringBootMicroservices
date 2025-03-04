import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchAllData {
    public static void main(String[] args) throws Exception {
        //declare initail variable with the values
        String url= "jdbc:mysql://localhost:3306/Test01";
        String userName="root";
        String passWord="Abhishek@1";
        // Query
        String query="select * from student";
        // Class for name
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establishing a connection
        Connection con= DriverManager.getConnection(url,userName,passWord);
        //Creating the statement
        Statement st =con.createStatement();
        //executing and storing the values with column name
        ResultSet rs=st.executeQuery(query);

        // to incremnet the pointer use
        while(rs.next()) {
            rs.next();
            String userData = rs.getInt(1) + " : " + rs.getString(2);
            System.out.println(userData);
        }

//        rs.next();
//        String userData2 = rs.getInt(1)+" : "+rs.getString(2);
//        System.out.println(userData2);
//
//        rs.next();
//        String userData3 = rs.getInt(1)+" : "+rs.getString(2);
//        System.out.println(userData3);

        //closing the connections
        st.close();
        con.close();
    }
}

/*
Output
2 : Udai
4 : Sivam
 */
