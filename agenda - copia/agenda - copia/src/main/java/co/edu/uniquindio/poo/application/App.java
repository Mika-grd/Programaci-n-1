package co.edu.uniquindio.poo.application;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Arrays;

import co.edu.uniquindio.poo.model.Agenda;
import co.edu.uniquindio.poo.model.Categoria;
import co.edu.uniquindio.poo.model.Contacto;
import co.edu.uniquindio.poo.model.Grupo;
import co.edu.uniquindio.poo.model.Reunion;

public class App {
    public static void main(String[] args) {
        
        Contacto contacto1=new Contacto("Julian Gutierrez", 
                 "Señor phyton", "Tesalónica apt #302", "310 1092893", 
                "julian@hotmail.com", 8);
        Contacto contacto2=new Contacto("Carlos Zuluaga", 
                "Mecánico", "Carrera 13 Calle 10A #61", "310 1000000", 
                "Carlos@hotmail.com", 9);
        Contacto contacto3=new Contacto("Liliana Guzman", 
                "Mamá", "barrio los naranjos, casa B #4", "310 2983485", 
                "LiliG@hotmail.com", 9);
        Contacto contacto4=new Contacto("Martin Serna", 
                 "Papa", "barrio los naranjos, casa B #4", "310 1092875", 
                "Martin@hotmail.com", 10);
        Contacto contacto5=new Contacto("Pedro Buseta", 
                "Transporte", "Carrera 65N Calle 10A #61", "310 1000023", 
                "Pedro@hotmail.com", 18);
        Contacto contacto6=new Contacto("Juliana Ríos", 
                "Hermana", "barrio la patria, casa B #4", "310 6543210", 
                "JuliR@hotmail.com", 90);
        
        Agenda agenda = new Agenda(15, 2, 2);

        agenda.añadirContacto(contacto1);
        agenda.añadirContacto(contacto2);
        System.out.println(Arrays.toString(agenda.getListaContactos()));
        agenda.eliminarContacto(contacto1);
        agenda.eliminarContacto(contacto6);
        System.out.println(Arrays.toString(agenda.getListaContactos()));
        agenda.editarContacto(contacto2,"Carlos Zuluaga", 
                "Esposo", "Carrera 13 Calle 10A #61", "310 1000000", 
                "Carlos@hotmail.com");
        System.out.println(contacto2);

        
        Grupo grupo1 = new Grupo("Familia", Categoria.FAMILIA);
        grupo1.añadirContactoGrupo(contacto4);
        grupo1.añadirContactoGrupo(contacto3);
        grupo1.añadirContactoGrupo(contacto6);
        grupo1.añadirContactoGrupo(contacto2);
        grupo1.añadirContactoGrupo(contacto1);

        System.out.println(Arrays.toString(agenda.getListaGrupos()));

       agenda.añadirGrupo(grupo1);

        grupo1.eliminarContactoGrupo(contacto6);
        agenda.editarGrupo(grupo1, "Frens", Categoria.AMIGOS, new Contacto[] {contacto1, contacto2, contacto3});
        System.out.println(Arrays.toString(agenda.getListaGrupos()));
        agenda.eliminarGrupo(grupo1);
        System.out.println(Arrays.toString(agenda.getListaGrupos()));

        Reunion reunion1 = new Reunion("Billar", LocalDate.of(2000, 6, 7), Time.valueOf("13:00:00"), 5);
        agenda.añadirReunion(reunion1);
        reunion1.agregarContactoAsistente(contacto6);
        reunion1.agregarContactoAsistente(contacto5);
        reunion1.agregarContactoAsistente(contacto4);
        reunion1.eliminarContactoAsistente(contacto6);
        System.out.println(Arrays.toString(agenda.getListaReuniones()));
        agenda.editarReunion(reunion1, "Ajedrez", LocalDate.of(200, 6, 9), Time.valueOf("14:00:00"), new Contacto[] {contacto1, contacto2});
        System.out.println(Arrays.toString(agenda.getListaReuniones()));
        agenda.eliminarReunion(reunion1);
        System.out.println(Arrays.toString(agenda.getListaReuniones()));
    }

}
