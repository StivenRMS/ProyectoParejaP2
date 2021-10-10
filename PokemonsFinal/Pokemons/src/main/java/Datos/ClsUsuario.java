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
public class ClsUsuario {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the coreoE
     */
    public String getCoreoE() {
        return coreoE;
    }

    /**
     * @param coreoE the coreoE to set
     */
    public void setCoreoE(String coreoE) {
        this.coreoE = coreoE;
    }

    private int id;
    private String usuario;
    private String pass;
    private String correo;
    private String nombre;
    private String coreoE;
    
    @Override
    public String toString() {
        return "ClsUsuario{" + "id=" + id + ", usuario=" + usuario + ", pass=" + pass + ", correo=" + correo + '}';
    }
   

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario.toUpperCase();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
     public ClsUsuario(){
         
    }
    
    public ClsUsuario(int id_usuario){
        this.id=id_usuario;
        
    }
    
    public ClsUsuario(int id_usuario,String usuario,String pass,String correo){
      this.id=id_usuario;
      this.usuario=usuario;
      this.pass =pass;
      this.correo = correo;
    }
}
