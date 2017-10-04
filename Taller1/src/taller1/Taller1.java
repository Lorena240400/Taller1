
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
            
            switch (ex.getErrorCode()){
                
                case 1045:
                    System.out.println("acceso denegado al usuario");
                    break;
                
                case 1064:
                    System.out.println("sentencia no valida");
                    break;
                    
                case 1146:
                    System.out.println("la base de datos no existe");
                    break;
                    
                case 1062:
                    System.out.println("inserte una nueva entrada");
                    break;
                    
                case 1046:
                    System.out.println("no existe conexion con la base de datos");
                    break;
                    
                case 1049:
                    System.out.println("base de datos incorrecta");
                    break;
                    
                default:
                    System.out.println("Error Desconocido");
                    
                
            }
            System.out.println(ex.getErrorCode());
        }
    }
    
}
