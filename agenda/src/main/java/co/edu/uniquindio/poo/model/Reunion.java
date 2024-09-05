package co.edu.uniquindio.poo.model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Reunion {
    private String descripcion;
    private Date fecha;
    private Time hora;
    private List <Contacto> listaContactosAsistentes;

    public Reunion(String descripcion,Date fecha,Time hora){
        this.descripcion=descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.listaContactosAsistentes = new ArrayList<>();
        
    }

    public String agregarContactoAsistente(Contacto contacto){
        String mensaje = "";

        for (Contacto contactoaux : listaContactosAsistentes) {
            if (contactoaux.equals(contacto)){
                mensaje = "Este contacto ya está en la lista de contactos asistentes";
            }else {
                listaContactosAsistentes.add(contacto);
                mensaje = "Contacto añadido a la reunión exitosamente";
            }
        }

        return mensaje;
    }

    public String eliminarContactoAsistente(Contacto contacto){
        String mensaje = "";

        for (Contacto contactoaux : listaContactosAsistentes) {
            if (contactoaux.equals(contacto)){
                listaContactosAsistentes.remove(contacto);
                mensaje = "Contacto eliminado correctamente";
            }else {
                mensaje = "Contacto no encontrado";
            }
        }

        return mensaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public List<Contacto> getListaContactosAsistentes() {
        return listaContactosAsistentes;
    }

    public void setListaContactosAsistentes(List<Contacto> listaContactosAsistentes) {
        this.listaContactosAsistentes = listaContactosAsistentes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        result = prime * result + ((hora == null) ? 0 : hora.hashCode());
        result = prime * result + ((listaContactosAsistentes == null) ? 0 : listaContactosAsistentes.hashCode());
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
        Reunion other = (Reunion) obj;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        if (hora == null) {
            if (other.hora != null)
                return false;
        } else if (!hora.equals(other.hora))
            return false;
        if (listaContactosAsistentes == null) {
            if (other.listaContactosAsistentes != null)
                return false;
        } else if (!listaContactosAsistentes.equals(other.listaContactosAsistentes))
            return false;
        return true;
    }


}