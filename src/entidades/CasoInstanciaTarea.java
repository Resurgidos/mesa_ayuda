package entidades;

import java.util.Date;

public class CasoInstanciaTarea extends Entidad {
    //Variables de instancia
    private String observacionesCasoInstanciaTarea;
    private Date fechaHoraInicioCasoInstanciaTarea;
    private Date fechaHoraFinCasoInstanciaTarea;
    //Variables de las relaciones 
    private TipoTarea tipoTarea;
   
    //Constructor por defecto
    public CasoInstanciaTarea(){
        
    }
    ////Setters y Getters 
    public Date getFechaHoraInicioCasoInstanciaTarea() {
        return fechaHoraInicioCasoInstanciaTarea;
    }

    public void setFechaHoraInicioCasoInstanciaTarea(Date fechaHoraInicioCasoInstanciaTarea) {
        this.fechaHoraInicioCasoInstanciaTarea = fechaHoraInicioCasoInstanciaTarea;
    }

    public Date getFechaHoraFinCasoInstanciaTarea() {
        return fechaHoraFinCasoInstanciaTarea;
    }

    public void setFechaHoraFinCasoInstanciaTarea(Date fechaHoraFinCasoInstanciaTarea) {
        this.fechaHoraFinCasoInstanciaTarea = fechaHoraFinCasoInstanciaTarea;
    }

    public String getObservacionesCasoInstanciaTarea() {
        return observacionesCasoInstanciaTarea;
    }

    public void setObservacionesCasoInstanciaTarea(String observacionesCasoInstanciaTarea) {
        this.observacionesCasoInstanciaTarea = observacionesCasoInstanciaTarea;
    }
    
    //Setters y Getters de las relaciones

    public TipoTarea getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(TipoTarea tipoTarea) {
        this.tipoTarea = tipoTarea;
    }
    
}
