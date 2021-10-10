/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;


import Datos.ClsUsuario;
import java.sql.*;

/**
 *
 * @author Cristian Luna
 */
public class BDUsuario {
    
    private static final String SQL_INSERT="insert into test.usuario (name_usuario,correo,contraseña) values (?,?,?)";

    
    
    public int insert(ClsUsuario usuario){
    
         Connection conexion=null;
        PreparedStatement statement=null;
        int rows=0;
        try{
            conexion=Conexion.getConnection();
            statement=conexion.prepareStatement(SQL_INSERT);
            statement.setString(1, usuario.getUsuario());
            statement.setString(2, usuario.getCorreo());
            statement.setString(3, usuario.getPass());
  
            System.out.println("El usuario a usa la siguietne sentencia: " + SQL_INSERT);
            rows=statement.executeUpdate();
        }
         catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }finally{
           Conexion.closeStm(statement);
           Conexion.closeCon(conexion);
        }
        return rows;
    }
    

    public boolean  Validar(ClsUsuario datos){
         Connection conexion=null;
        PreparedStatement statement=null;
        ResultSet rs=null;
        boolean tienepermiso=false;
        
        try {
            conexion=Conexion.getConnection();
          
            String Condicion="SELECT * FROM test.usuario where name_usuario='"+datos.getUsuario()+"'"
                    + " and contraseña='"+datos.getPass()+"';";
            statement=conexion.prepareStatement(Condicion);
            rs=statement.executeQuery();
            
            while (rs.next()) {
                    tienepermiso=true;
            }      
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }finally{
           Conexion.closeCon(conexion);
           Conexion.closeresult(rs);
           Conexion.closeStm(statement);
        }
        
        return tienepermiso;
    }
}
