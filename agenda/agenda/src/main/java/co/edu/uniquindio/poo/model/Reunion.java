package co.edu.uniquindio.poo.model;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

public class Reunion {
    private String descripcion;
    private Date fecha;
    private Time hora;
    private Contacto[] listaContactosAsistentes;
    private int numeroContactosAsistentes;

    public Reunion(String descripcion,Date fecha,Time hora, int numeroContactosAsistentes){
        this.descripcion=descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.numeroContactosAsistentes = numeroContactosAsistentes;
        this.listaContactosAsistentes = new Contacto[numeroContactosAsistentes];
        
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

    public Contacto[] getListaContactosAsistentes() {
        return listaContactosAsistentes;
    }

    public void setListaContactosAsistentes(Contacto[] listaContactosAsistentes) {
        this.listaContactosAsistentes = listaContactosAsistentes;
    }

    public int getNumeroContactosAsistentes() {
        return numeroContactosAsistentes;
    }

    public void setNumeroContactosAsistentes(int numeroContactosAsistentes) {
        this.numeroContactosAsistentes = numeroContactosAsistentes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        result = prime * result + ((hora == null) ? 0 : hora.hashCode());
        result = prime * result + Arrays.hashCode(listaContactosAsistentes);
        result = prime * result + numeroContactosAsistentes;
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
        if (!Arrays.equals(listaContactosAsistentes, other.listaContactosAsistentes))
            return false;
        if (numeroContactosAsistentes != other.numeroContactosAsistentes)
            return false;
        return true;
    }


}
