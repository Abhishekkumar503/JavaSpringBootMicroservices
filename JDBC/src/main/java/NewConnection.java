import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NewConnection {
    public static void main(String[] args) throws Exception {
        String url= "";
        String userName="";
        String passWord="";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,userName,passWord);
    }
}
