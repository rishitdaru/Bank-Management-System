package bank.mangement.system;

import java.sql.*;

/**
 * @author Rishit  Daru
 */

/* Steps to establish JDBC connection:
1. Register the driver
2. Create connection
3. Creaate Statement
4. Execute Query
5. Close Connection
*/
public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn(){
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","admin");
            s = c.createStatement();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
