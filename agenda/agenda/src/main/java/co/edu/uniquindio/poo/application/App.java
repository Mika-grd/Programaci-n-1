package co.edu.uniquindio.poo.application;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.model.Contacto;

public class App {
    public static void main(String[] args) {
        
        Contacto Contacto1=new Contacto("Julian Gutierrez", 
                 "Señor phyton", "Tesalónica apt #302", "310 1092893", 
                "julian@hotmail.com");
        Contacto Contacto2=new Contacto("Carlos Zuluaga", 
                "Mecánico", "Carrera 13 Calle 10A #61", "310 1000000", 
                "Carlos@hotmail.com");
        Contacto Contacto3=new Contacto("Liliana Guzman", 
                "Mamá", "barrio los naranjos, casa B #4", "310 2983485", 
                "LiliG@hotmail.com");
        

        //cuadro de prueba:
        JOptionPane.showMessageDialog(null, "Los contactos establecidos hasta ahora son:"
                                            +"\nn1."+Contacto1.getNombres()
                                            +"\nn3."+Contacto2.getNombres()
                                            +"\nn3."+Contacto3.getNombres());
                                            
    }

}
