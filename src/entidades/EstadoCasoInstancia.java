package entidades;

import java.util.Date;

public class EstadoCasoInstancia extends Entidad{
    
    //Variables de instancia
    private int codEstadoCasoInstancia;
    private String nombreEstadoCasoInstancia;
    private Date fechaHoraFinVigenciaECI;
    
    //Constructor por defecto
    public EstadoCasoInstancia(){ 
    }
    
    //Getters y Setters
    public int getCodEstadoCasoInstancia() {
        return codEstadoCasoInstancia;
    }

    public void setCodEstadoCasoInstancia(int codEstadoCasoInstancia) {
        this.codEstadoCasoInstancia = codEstadoCasoInstancia;
    }

    public String getNombreEstadoCasoInstancia() {
        return nombreEstadoCasoInstancia;
    }

    public void setNombreEstadoCasoInstancia(String nombreEstadoCasoInstancia) {
        this.nombreEstadoCasoInstancia = nombreEstadoCasoInstancia;
    }

    public Date getFechaHoraFinVigenciaECI() {
        return fechaHoraFinVigenciaECI;
    }

    public void setFechaHoraFinVigenciaECI(Date fechaHoraFinVigenciaECI) {
        this.fechaHoraFinVigenciaECI = fechaHoraFinVigenciaECI;
    }
    
    
    
    
    
}
