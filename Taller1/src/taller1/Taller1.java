
package taller1;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Taller1 {

    
    public static void main(String[] args) {
       Connection conexion;
       String url="jdbc:mysql://localhost:3306/Taller1";
       String usuario="root";
       String clave="mysql2017";
       
        try {
            conexion=DriverManager.getConnection(url,usuario,clave);
            System.out.println("por fin");
            String cadena="INSERT INTO taller1(idtaller,dato)VALUES (1,1)";
            Statement sentencia;
            sentencia =conexion.createStatement();
            sentencia.execute(cadena);
            
        } catch (SQLException ex) {
            
            
        }
    }
    
}
