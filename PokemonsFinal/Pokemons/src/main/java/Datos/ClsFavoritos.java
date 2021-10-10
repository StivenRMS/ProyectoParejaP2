/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;




/**
 *
 * @author Cristian Luna
 */
public class ClsFavoritos {

    private String usuario;
    private int id_pokemon;

    @Override
    public String toString() {
        return "ClsFavoritos{" + "usuario=" + usuario + ", id_pokemon=" + id_pokemon + '}';
    }
    
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    

    public int getId_pokemon() {
        return id_pokemon;
    }

    public void setId_pokemon(int id_pokemon) {
        this.id_pokemon = id_pokemon;
    }
   
}
