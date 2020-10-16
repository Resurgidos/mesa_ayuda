package DTO.DTOsConfiguración;

import entidades.TipoCaso;
import java.util.Date;

public class DTODatosConfiguracion {
   
    private int nroConfigTC;
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;
    private Date fechaVerificacion;
    private int codTipoCaso;
    private String nombreTC;

    public int getNroConfigTC() {
        return nroConfigTC;
    }

    public void setNroConfigTC(int nroConfigTC) {
        this.nroConfigTC = nroConfigTC;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public Date getFechaVerificacion() {
        return fechaVerificacion;
    }

    public void setFechaVerificacion(Date fechaVerificacion) {
        this.fechaVerificacion = fechaVerificacion;
    }

    public int getCodTipoCaso() {
        return codTipoCaso;
    }

    public void setCodTipoCaso(int codTipoCaso) {
        this.codTipoCaso = codTipoCaso;
    }

    public String getNombreTC() {
        return nombreTC;
    }

    public void setNombreTC(String nombreTC) {
        this.nombreTC = nombreTC;
    }
    
    
    
}
