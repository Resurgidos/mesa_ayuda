package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CasoInstancia extends Entidad {
    //Variables de instancia
    private Date fechaHoraFinPlanificada;
    private Date fechaHoraFinReal;
    private Date fechaHoraInicioPlanificada;
    private Date fechaHoraInicioReal;
    private String observaciones;
    private int ordenCasoIntancia;
    //Variables de relaciones
    private EstadoCasoInstancia eCasoInstancia;
    private Especialista especialista;
    private List<CasoInstanciaTarea> casoInsTarea = new ArrayList<>();
    private TipoInstancia tipoInstancia;
    
    //Constructor por defecto
    public CasoInstancia(){
    }
    //Setters y Getters 
    public Date getFechaHoraFinPlanificada() {
        return fechaHoraFinPlanificada;
    }

    public void setFechaHoraFinPlanificada(Date fechaHoraFinPlanificada) {
        this.fechaHoraFinPlanificada = fechaHoraFinPlanificada;
    }

    public Date getFechaHoraFinReal() {
        return fechaHoraFinReal;
    }

    public void setFechaHoraFinReal(Date fechaHoraFinReal) {
        this.fechaHoraFinReal = fechaHoraFinReal;
    }

    public Date getFechaHoraInicioPlanificada() {
        return fechaHoraInicioPlanificada;
    }

    public void setFechaHoraInicioPlanificada(Date fechaHoraInicioPlanificada) {
        this.fechaHoraInicioPlanificada = fechaHoraInicioPlanificada;
    }

    public Date getFechaHoraInicioReal() {
        return fechaHoraInicioReal;
    }

    public void setFechaHoraInicioReal(Date fechaHoraInicioReal) {
        this.fechaHoraInicioReal = fechaHoraInicioReal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getOrdenCasoIntancia() {
        return ordenCasoIntancia;
    }

    public void setOrdenCasoIntancia(int OrdenCasoIntancia) {
        this.ordenCasoIntancia = OrdenCasoIntancia;
    }
    //Setters y Getters de las relaciones

    public EstadoCasoInstancia geteCasoInstancia() {
        return eCasoInstancia;
    }

    public void seteCasoInstancia(EstadoCasoInstancia eCasoInstancia) {
        this.eCasoInstancia = eCasoInstancia;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public List<CasoInstanciaTarea> getCasoInsTarea() {
        return casoInsTarea;
    }

    public void setCasoInsTarea(List<CasoInstanciaTarea> casoInsTarea) {
        this.casoInsTarea = casoInsTarea;
    }

    public TipoInstancia getTipoInstancia() {
        return tipoInstancia;
    }

    public void setTipoInstancia(TipoInstancia tipoInstancia) {
        this.tipoInstancia = tipoInstancia;
    }
    
    
    
}
