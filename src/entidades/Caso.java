package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Caso extends Entidad {
    
    //Variables de instancia
    private Date fechaHoraCaducidadCaso;
    private Date fechaHoraFinCaso;
    private Date fechaHoraIngresoCaso;
    private int numeroCaso;
    private String observacionCaso;
    //Variables de relaciones
    private EstadoCaso estCaso;
    private TipoCaso tipoCaso;
    private List<CasoInstancia> casoinstancia= new ArrayList<>();
    
    //Constructor por defecto de la clase
    public Caso(){
        
    }
    
    //Getters y Setters
    public Date getFechaHoraCaducidadCaso() {
        return fechaHoraCaducidadCaso;
    }

    public void setFechaHoraCaducidadCaso(Date fechaHoraCaducidadCaso) {
        this.fechaHoraCaducidadCaso = fechaHoraCaducidadCaso;
    }

    public Date getFechaHoraFinCaso() {
        return fechaHoraFinCaso;
    }

    public void setFechaHoraFinCaso(Date fechaHoraFinCaso) {
        this.fechaHoraFinCaso = fechaHoraFinCaso;
    }

    public Date getFechaHoraIngresoCaso() {
        return fechaHoraIngresoCaso;
    }

    public void setFechaHoraIngresoCaso(Date fechaHoraIngresoCaso) {
        this.fechaHoraIngresoCaso = fechaHoraIngresoCaso;
    }

    public int getNumeroCaso() {
        return numeroCaso;
    }

    public void setNumeroCaso(int numeroCaso) {
        this.numeroCaso = numeroCaso;
    }

    public String getObservacionCaso() {
        return observacionCaso;
    }

    public void setObservacionCaso(String observacionCaso) {
        this.observacionCaso = observacionCaso;
    }
    
    //Getters y Setters de las relaciones
    public EstadoCaso getEstCaso() {
        return estCaso;
    }

    public void setEstCaso(EstadoCaso estCaso) {
        this.estCaso = estCaso;
    }

    public TipoCaso getTipoCaso() {
        return tipoCaso;
    }

    public void setTipoCaso(TipoCaso tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    public List<CasoInstancia> getCasoinstancia() {
        return casoinstancia;
    }

    public void setCasoinstancia(ArrayList<CasoInstancia> casoinstancia) {
        this.casoinstancia = casoinstancia;
    }
    
    
    
    
}
