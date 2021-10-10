/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correo;

import java.io.File;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author ramos
 */
public class Clscorreo {
    
    public void Correo(String correo, String nombre){
        
       try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");

            Session session = Session.getDefaultInstance(props);

            String REMITENTE = "stvenramosliceo2021";
            String passwordR = "RMS123456@";
            String Receptor = correo; 
            String asunto = "CORREO POKEDEX";
            String mensaje = "SALU2 "+ nombre +" aqui tienes tu consulta:";
            String file="C:\\Users\\ramos\\Desktop\\Pokemons\\CONSULTA_POKEDEX.pdf";
           
            BodyPart texto=new MimeBodyPart();
            texto.setText(mensaje);
            BodyPart Adjunto=new MimeBodyPart();
            Adjunto.setDataHandler(new  DataHandler(new FileDataSource(file)));
            File arc= new  File(file);
            Adjunto.setFileName(arc.getName());
            
            
            MimeMultipart mul=new MimeMultipart();
            mul.addBodyPart(texto);
            mul.addBodyPart(Adjunto);
            
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(REMITENTE));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(Receptor));
            message.setSubject(asunto);
            message.setContent(mul);
         

            Transport t = session.getTransport("smtp");
            t.connect(REMITENTE, passwordR);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();

            JOptionPane.showMessageDialog(null, "Correo Electronico Enviado");

        } catch (AddressException ex) {
            Logger.getLogger(Clscorreo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Clscorreo.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
