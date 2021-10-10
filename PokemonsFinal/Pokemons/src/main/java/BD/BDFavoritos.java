/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Datos.ClsFavoritos;
import Datos.ClsPokemon;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian Luna
 */

public class BDFavoritos {
    
public List<ClsPokemon> dtpokemon(int idd){
    
     Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ClsPokemon poke = null;
        List<ClsPokemon> arrancar= new  ArrayList<ClsPokemon>();
        try {
            conn = Conexion.getConnection();
            String SQL = "select *\n"
                    + "from test.pokemon\n"
                    + "where id =" + idd;
            stmt=conn.prepareStatement(SQL);
            
            
           
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
    
     public int insert(ClsFavoritos favoritos,int id, String name){
        int rows=0;
        Connection conn=null;
        PreparedStatement stmt=null;
        try {
            conn=Conexion.getConnection();
            stmt=conn.prepareStatement("insert into favoritos (id_pokemon,usuario) values ('"+id+"','"+name+"')");

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
     
     
     
     public  List<ClsPokemon> select(String nam){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ClsPokemon poke = null;
        List<ClsPokemon> arrancar= new  ArrayList<ClsPokemon>();
        try {
            conn = Conexion.getConnection();

            stmt=conn.prepareStatement("select * from pokemon where id in(select id_pokemon from favoritos where usuario = '"+nam+"')");
            
            
           
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
    
}
