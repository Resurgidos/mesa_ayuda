package entidades;

import java.util.Date;

public class EstadoCaso extends Entidad{
    
    //Variables de instancia
    private int codEstadoCaso;
    private String nombreEstadoCaso;
    private Date fechaHoraFinVigenciaEC;

    //Constructor por defecto 
    public EstadoCaso(){
    }
    
    
    //Getters y Setters
    public int getCodEstadoCaso() {
        return codEstadoCaso;
    }

    public void setCodEstadoCaso(int codEstadoCaso) {
        this.codEstadoCaso = codEstadoCaso;
    }

    public String getNombreEstadoCaso() {
        return nombreEstadoCaso;
    }

    public void setNombreEstadoCaso(String nombreEstadoCaso) {
        this.nombreEstadoCaso = nombreEstadoCaso;
    }

    public Date getFechaHoraFinVigenciaEC() {
        return fechaHoraFinVigenciaEC;
    }

    public void setFechaHoraFinVigenciaEC(Date fechaHoraFinVigenciaEC) {
        this.fechaHoraFinVigenciaEC = fechaHoraFinVigenciaEC;
    }

   
    
    
        
    
}
