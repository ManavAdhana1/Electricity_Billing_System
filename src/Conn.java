import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn
{
    Statement s;
    Connection c;
    Conn()
    {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "Manav", "Manav@124");
            s = c.createStatement();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
