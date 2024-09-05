package co.edu.uniquindio.poo.application;

import co.edu.uniquindio.poo.model.Agenda;
import co.edu.uniquindio.poo.model.Categoria;
import co.edu.uniquindio.poo.model.Contacto;
import co.edu.uniquindio.poo.model.Grupo;

public class App {
    public static void main(String[] args) {
        
        Contacto contacto1=new Contacto("Julian Gutierrez", 
                 "Señor phyton", "Tesalónica apt #302", "310 1092893", 
                "julian@hotmail.com");
        Contacto contacto2=new Contacto("Carlos Zuluaga", 
                "Mecánico", "Carrera 13 Calle 10A #61", "310 1000000", 
                "Carlos@hotmail.com");
        Contacto contacto3=new Contacto("Liliana Guzman", 
                "Mamá", "barrio los naranjos, casa B #4", "310 2983485", 
                "LiliG@hotmail.com");
        Contacto contacto4=new Contacto("Martin Serna", 
                 "Papa", "barrio los naranjos, casa B #4", "310 1092875", 
                "Martin@hotmail.com");
        Contacto contacto5=new Contacto("Pedro Buseta", 
                "Transporte", "Carrera 65N Calle 10A #61", "310 1000023", 
                "Pedro@hotmail.com");
        Contacto contacto6=new Contacto("Juliana Ríos", 
                "Hermana", "barrio la patria, casa B #4", "310 6543210", 
                "JuliR@hotmail.com");
        
        Agenda agenda = new Agenda();

        agenda.añadirContacto(contacto1);
        agenda.añadirContacto(contacto2);
        System.out.println(agenda.listaContactos);
        agenda.eliminarContacto(contacto1);
        agenda.eliminarContacto(contacto6);
        System.out.println(agenda.listaContactos);
        
        System.out.println(contacto2);

        
        Grupo grupo1 = new Grupo("Familia", Categoria.FAMILIA);
        grupo1.añadirContactoGrupo(contacto4);
        grupo1.añadirContactoGrupo(contacto3);
        grupo1.añadirContactoGrupo(contacto6);
        grupo1.añadirContactoGrupo(contacto2);
        grupo1.añadirContactoGrupo(contacto1);

        System.out.println(grupo1.getListaContactosPertenecientes());
    }

}
