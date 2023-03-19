
package Lógica;

import Datos.DUsuarios;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SLQUsuarios extends LConexion{
    
    public boolean registrar (DUsuarios usr){
        
        PreparedStatement ps = null;
        Connection con = (Connection) getConexion();
        
    
    
     String sql = ("INSERT INTO Clientes (CodigoCl, Nombre, ClaveCliente, Cedula, Telefono, Direccion, Correo) VALUES (?,?,?,?,?,?,?)");    
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getCodigoCl());
            ps.setString(2,String.valueOf(usr.getNombre()));
            ps.setString(3, String.valueOf(usr.getClaveCliente()));
            ps.setInt(4, usr.getCedula());
            ps.setInt(5, usr.getTelefono());
            ps.setString(6, String.valueOf(usr.getDireccion()));
            ps.setString(7, String.valueOf(usr.getCorreo()));
            ps.execute();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SLQUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
