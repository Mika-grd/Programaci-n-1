package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    //crear enumeración
    public enum Categoria{
        OFICINA,
        FIESTA,
        AMIGOS,
        FAMILIA
    }
    private String nombre;
    private Categoria categoria;
    private List <Contacto> listaContactosPertenecientes;

    //constructor
    public Grupo(String nombre, Categoria categoria){
        this.nombre=nombre;
        this.categoria=categoria;
        this.listaContactosPertenecientes = new ArrayList<>(5); //lista con capacidad para 5 contactos
    }

    
    public boolean añadirContacto(Contacto contacto){
        if ()
    }

    

    //getters  y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Contacto> getListaContactosPertenecientes() {
        return listaContactosPertenecientes;
    }

    public void setListaContactosPertenecientes(List<Contacto> listaContactosPertenecientes) {
        this.listaContactosPertenecientes = listaContactosPertenecientes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result
                + ((listaContactosPertenecientes == null) ? 0 : listaContactosPertenecientes.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Grupo other = (Grupo) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (categoria != other.categoria)
            return false;
        if (listaContactosPertenecientes == null) {
            if (other.listaContactosPertenecientes != null)
                return false;
        } else if (!listaContactosPertenecientes.equals(other.listaContactosPertenecientes))
            return false;
        return true;
    }


}
