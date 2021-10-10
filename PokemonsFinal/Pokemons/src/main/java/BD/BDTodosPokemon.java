/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;


import Interface.BusquedaPokemon;
import Datos.ClsPokemon;
import Datos.ClsUsuario;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Cristian Luna
 */
public class BDTodosPokemon {
    private static final String SQL_SELECT = "select * from pokemon";
    private static final String SQL_UPDATE = "update personal set nombre=?,enero=?, febrero=?, marzo=? ,total=?,promedio=? where codigo=?";
    private static final String SQL_INSERT = "insert into personal (nombre,enero,febrero,marzo,total,promedio) values (?,?,?,?,?,?)";
    private static final String SQL_DELETE = "delete from personal where codigo=?";
    
    //paso 1 definir el String de conexion
        String url = "jdbc:mysql://localhost:3306/p2proyectoperonsal?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
       

               
                
        
        public List<ClsPokemon> selectglobal(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ClsPokemon poke = null;
        List<ClsPokemon> arrancar= new  ArrayList<ClsPokemon>();
        try {
            conn = Conexion.getConnection();

            

                 stmt = conn.prepareStatement(SQL_SELECT);

           
            rs = stmt.executeQuery();
            while(rs.next()){
     String  id = rs.getString("id");   
      String name = rs.getString("name");   
      String forme_name = rs.getString("forme_name");   
      String forme_base_pokemon_id = rs.getString("forme_base_pokemon_id");   
      String generation_id = rs.getString("generation_id");   
      String evolution_chain_id = rs.getString("evolution_chain_id");   
      String evolution_parent_pokemon_id = rs.getString("evolution_parent_pokemon_id");   
      String evolution_method_id = rs.getString("evolution_method_id");   
      String evolution_parameter = rs.getString("evolution_parameter");   
      String height = rs.getString("height");   
      String weight = rs.getString("weight");   
      String species = rs.getString("species");   
      String color = rs.getString("color");   
      String pokemon_shape_id = rs.getString("pokemon_shape_id");   
      String habitat = rs.getString("habitat");   
      String gender_rate = rs.getString("gender_rate");   
      String capture_rate = rs.getString("capture_rate") ;   
      String base_experience = rs.getString("base_experience");   
      String base_happiness = rs.getString("base_happiness");   
      String gen1_internal_id = rs.getString("gen1_internal_id");   
      String is_baby = rs.getString("is_baby");   
      String has_gen4_fem_sprite = rs.getString("has_gen4_fem_sprite");   
      String has_gen4_fem_back_sprite = rs.getString("has_gen4_fem_back_sprite");


                poke = new ClsPokemon();
                
       poke.setId(id);  
       poke.setName(name) ;   
       poke.setForme_name(forme_name) ;   
       poke.setForme_base_pokemon_id(forme_base_pokemon_id) ;   
       poke.setGeneration_id(generation_id) ;   
       poke.setEvolution_chain_id (evolution_chain_id);   
       poke.setEvolution_parent_pokemon_id(evolution_parent_pokemon_id) ;   
       poke.setEvolution_method_id(evolution_method_id) ;   
       poke.setEvolution_parameter(evolution_parameter) ;   
       poke.setHeight (height);   
       poke.setWeight (weight);   
       poke.setSpecies (species);   
       poke.setColor (color);   
       poke.setPokemon_shape_id (pokemon_shape_id);   
       poke.setHabitat (habitat);   
       poke.setGender_rate (gender_rate);   
       poke.setCapture_rate (capture_rate);   
       poke.setBase_experience (base_experience);   
       poke.setBase_happiness (base_happiness);   
       poke.setGen1_internal_id(gen1_internal_id);   
       poke.setIs_baby (is_baby);   
       poke.setHas_gen4_fem_sprite (has_gen4_fem_sprite);   
       poke.setHas_gen4_fem_back_sprite (has_gen4_fem_back_sprite);

        
                arrancar.add(poke);
   

            }
            
        }catch (SQLException ex){
            ex.printStackTrace(System.out);
        }
        finally{
           Conexion.closeCon(conn);
           Conexion.closeStm(stmt);
           Conexion.closeresult(rs);
        }

        return arrancar;
        
        
    }
        
        public static String control;
 
        
        public List<ClsPokemon> select(String nombre){
    
            
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ClsPokemon poke = null;
        List<ClsPokemon> arrancar= new  ArrayList<ClsPokemon>();
        try {
            conn = Conexion.getConnection();
                
                stmt = conn.prepareStatement("SELECT * FROM test.pokemon where "+control+" = '"+nombre+"'");
            
            
            rs = stmt.executeQuery();
            while(rs.next()){
     String  id = rs.getString("id");   
      String name = rs.getString("name");   
      String forme_name = rs.getString("forme_name");   
      String forme_base_pokemon_id = rs.getString("forme_base_pokemon_id");   
      String generation_id = rs.getString("generation_id");   
      String evolution_chain_id = rs.getString("evolution_chain_id");   
      String evolution_parent_pokemon_id = rs.getString("evolution_parent_pokemon_id");   
      String evolution_method_id = rs.getString("evolution_method_id");   
      String evolution_parameter = rs.getString("evolution_parameter");   
      String height = rs.getString("height");   
      String weight = rs.getString("weight");   
      String species = rs.getString("species");   
      String color = rs.getString("color");   
      String pokemon_shape_id = rs.getString("pokemon_shape_id");   
      String habitat = rs.getString("habitat");   
      String gender_rate = rs.getString("gender_rate");   
      String capture_rate = rs.getString("capture_rate") ;   
      String base_experience = rs.getString("base_experience");   
      String base_happiness = rs.getString("base_happiness");   
      String gen1_internal_id = rs.getString("gen1_internal_id");   
      String is_baby = rs.getString("is_baby");   
      String has_gen4_fem_sprite = rs.getString("has_gen4_fem_sprite");   
      String has_gen4_fem_back_sprite = rs.getString("has_gen4_fem_back_sprite");


                poke = new ClsPokemon();
                
       poke.setId(id);  
       poke.setName(name) ;   
       poke.setForme_name(forme_name) ;   
       poke.setForme_base_pokemon_id(forme_base_pokemon_id) ;   
       poke.setGeneration_id(generation_id) ;   
       poke.setEvolution_chain_id (evolution_chain_id);   
       poke.setEvolution_parent_pokemon_id(evolution_parent_pokemon_id) ;   
       poke.setEvolution_method_id(evolution_method_id) ;   
       poke.setEvolution_parameter(evolution_parameter) ;   
       poke.setHeight (height);   
       poke.setWeight (weight);   
       poke.setSpecies (species);   
       poke.setColor (color);   
       poke.setPokemon_shape_id (pokemon_shape_id);   
       poke.setHabitat (habitat);   
       poke.setGender_rate (gender_rate);   
       poke.setCapture_rate (capture_rate);   
       poke.setBase_experience (base_experience);   
       poke.setBase_happiness (base_happiness);   
       poke.setGen1_internal_id(gen1_internal_id);   
       poke.setIs_baby (is_baby);   
       poke.setHas_gen4_fem_sprite (has_gen4_fem_sprite);   
       poke.setHas_gen4_fem_back_sprite (has_gen4_fem_back_sprite);


                arrancar.add(poke);
   
                 System.out.println("EL usuario a usado la siguiente sentencai: " + SQL_SELECT);
            }
            
        }catch (SQLException ex){
            ex.printStackTrace(System.out);
        }
        finally{
           Conexion.closeCon(conn);
           Conexion.closeStm(stmt);
           Conexion.closeresult(rs);
        }

        return arrancar;
        
    } 
        
        
        
        
        
        /*
      public int insert(ClsPokemon vendedor){
        int rows=0;
        Connection conn=null;
        PreparedStatement stmt=null;
        try {
            conn=Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, vendedor.getNombre());
            stmt.setDouble(2, vendedor.getEnero());
            stmt.setDouble(3, vendedor.getFebrero());
            stmt.setDouble(4, vendedor.getMarzo());
            stmt.setDouble(5, vendedor.getVentatotal());
            stmt.setDouble(6, vendedor.getPromedio());
            
            System.out.println("EL usuario a usado la siguiente sentencai: " + SQL_INSERT);
            rows=stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.closeCon(conn);
            Conexion.closeStm(stmt);
        }
        return rows;
    }
      
      
      public int actualizar(ClsPokemon alumno){
          int x = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

             stmt.setString(1, alumno.getNombre());
            stmt.setDouble(2, alumno.getEnero());
            stmt.setDouble(3, alumno.getFebrero());
            stmt.setDouble(4, alumno.getMarzo());
            stmt.setDouble(5, alumno.getVentatotal());
            stmt.setDouble(6, alumno.getPromedio());
            stmt.setInt(7, alumno.getCodigo());
            
            System.out.println("EL usuario a usado la siguiente sentencai: " + SQL_UPDATE);
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.closeStm(stmt);
            Conexion.closeCon(conn);
        }
        
        return rows;
    }
      
       public int borrar(ClsPokemon alumno){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, alumno.codigo);
            
            System.out.println("EL usuario a usado la siguiente sentencai: " + SQL_DELETE);
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.closeStm(stmt);
            Conexion.closeCon(conn);
        }
        
        return rows;
    }
   
       
           public String Ventas(String Mes,String op){
        String Respuesta="";
        String Nombre="";
        Double Cantidad=0.0;
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        
        try {
            conn=Conexion.getConnection();
            stmt=conn.prepareStatement("selectglobal nombre,"+Mes +" from personal where "+ Mes+"=(selectglobal "+op+"("+Mes+") from personal);");
            rs=stmt.executeQuery();
            while(rs.next()){
                Nombre=rs.getString("Nombre");
                Cantidad=rs.getDouble(Mes);
                
                Respuesta+=("El Nombre de la persona que vendio mas es: "+Nombre+""
                        + "\nY la cantidad acumulada es de: Q"+Cantidad+"\n");
            }    
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            Conexion.closeCon(conn);
           Conexion.closeStm(stmt);
           Conexion.closeresult(rs);
        }
        
        return Respuesta;
    }
    
    public String VentaMayor(){
        String Respuesta="";
        String Nombre="";
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        
        try {
            conn=Conexion.getConnection();
            stmt=conn.prepareStatement("selectglobal nombre from personal where total=(selectglobal max(total) from personal);");
            rs=stmt.executeQuery();
            while(rs.next()){
                Nombre=rs.getString("nombre");
            }
            
            Respuesta=("La persona que mas vendio en los 3 Meses es: "+Nombre);
            
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
             Conexion.closeCon(conn);
           Conexion.closeStm(stmt);
           Conexion.closeresult(rs);
        }
        return Respuesta;
    }
*/
}
