package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Agenda {
    public ArrayList<Contacto> listaContactos;
    public ArrayList<Reunion> listaReuniones;
    public ArrayList<Grupo> listaGrupos;

    public Agenda(){
        this.listaContactos = new ArrayList<>();
        this.listaReuniones = new ArrayList<>();
        this.listaGrupos = new ArrayList<>();
    }
    

    public void añadirContacto(Contacto contacto){
        if (contacto == null){
            System.out.println("El contacto no puede estar vacio"); 
        }
        Contacto contactoaux = buscarContacto(contacto);
        if (contactoaux == null){
            listaContactos.add(contacto);
            System.out.println("Contacto añadido correctamente");
        }else{
            System.out.println("Este contacto ya existe");
        }
    }

    public Contacto buscarContacto(Contacto contacto){
        Contacto contactoEncontrado = null;
        if (listaContactos.contains(contacto)){
            contactoEncontrado = contacto;
        }
        return contactoEncontrado;

    }
    public void eliminarContacto(Contacto contacto){
        String mensaje = "Contacto no encontrado";
        Contacto contactoaux = buscarContacto(contacto);
        if (contactoaux != null){
            listaContactos.remove(contactoaux);
            mensaje = "Contacto eliminado correctamente";
        }
        System.out.println(mensaje);
    }

    public void editarContacto(Contacto contacto, String nombres, String alias, String direccion, String telefono, String email){
        String mensaje = "Contacto no encontrado";
        Contacto contactoEncontrado = buscarContacto(contacto);
        if (contactoEncontrado != null){
            contacto.setNombres(nombres);
            contacto.setAlias(alias);
            contacto.setDireccion(direccion);
            contacto.setTelefono(telefono);
            contacto.setEmail(email);
            mensaje = "Contacto editado exitosamente";
        System.out.println(mensaje);
        }
        
    }

    public void crearGrupo(Grupo grupo){
        String mensaje = "";
        Grupo grupoaux = buscarGrupo(grupo);
        if (grupoaux == null){
            listaGrupos.add(grupo);
            mensaje = "Grupo creado correctamente";
        }else{
            mensaje = "Grupo ya existe";
        }
        System.out.println(mensaje);
    }

    public Grupo buscarGrupo(Grupo grupo){
        Grupo grupoEncontrado = null;
        if (listaGrupos.contains(grupo)){
            grupoEncontrado = grupo;
        }
        return grupoEncontrado;

    }    

    public void eliminarGrupo(Grupo grupo){
        String mensaje = "";
        Grupo grupoaux = buscarGrupo(grupo);
        if (grupoaux == null){
            mensaje = "Grupo no existe";
        }else{
            listaGrupos.remove(grupo);
            mensaje = "Grupo ya existe";
        }
        System.out.println(mensaje);
    }


    /**
     * Edita un grupo, recibe el grupo que se desea editar y la informacion nueva en forma de Grupo que se desea actualizar
     * @param Grupo  
     * @param informacionGrupoNuevo 
     * 
     */
    public void editarGrupo(Grupo grupo, Grupo informacionGrupoNuevo){ 
        String mensaje = "No se ha encontrado el grupo";
        Grupo grupoEncontrado = buscarGrupo(grupo);
        if (grupoEncontrado != null){
            grupo.setCategoria(informacionGrupoNuevo.getCategoria());
            grupo.setListaContactosPertenecientes(informacionGrupoNuevo.getListaContactosPertenecientes());
            grupo.setNombre(informacionGrupoNuevo.getNombre());
            mensaje = "Grupo actualizado con exito";
        }
        System.out.println(mensaje);
    }
    
    public Reunion buscarReunion(Reunion reunion){
        Reunion reunionEncontrada = null;
        if (listaReuniones.contains(reunion)){
            reunionEncontrada = reunion;
        }
        return reunionEncontrada;

    } 

    public void crearReunion(Reunion reunion){
        String mensaje = "";
        Reunion reunionaux = buscarReunion(reunion);
        if (reunionaux == null){
            listaReuniones.add(reunion);
            mensaje = "Reunuin creada correctamente";
        }else{
            mensaje = "Reunion ya existe";
        }
        System.out.println(mensaje);
    }

    public void eliminarReunion(Reunion reunion){
        String mensaje = "No se encontró la reunion";
        Reunion reunionaux = buscarReunion(reunion);
        if (reunionaux != null){
            listaReuniones.remove(reunion);
            mensaje = "Reunion eliminada correctamente";
        }
        System.out.println (mensaje);
    }

    public void editarReunion(Reunion reunion, Reunion reunionNuevaInformacion){
        String mensaje = "No se encontro la reunion";
        Reunion reunionEncontrado = buscarReunion(reunion);
        if (reunionEncontrado != null){
            reunion.setDescripcion(reunionNuevaInformacion.getDescripcion());
            reunion.setFecha(reunionNuevaInformacion.getFecha());
            reunion.setHora(reunionNuevaInformacion.getHora());
            reunion.setListaContactosAsistentes(reunionNuevaInformacion.getListaContactosAsistentes());
            mensaje = "Reunion actualizada correctamente";
        }
        
        System.out.println(mensaje);
    
    }


//Setters and Getters 

    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public ArrayList<Reunion> getListaReuniones() {
        return listaReuniones;
    }

    public void setListaReuniones(ArrayList<Reunion> listaReuniones) {
        this.listaReuniones = listaReuniones;
    }

    public ArrayList<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(ArrayList<Grupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
    
}

}