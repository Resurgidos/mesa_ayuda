/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author julie
 */
public class DTOAgregarConfiguracion {
    int nroConfiguracion;
    int codTipoCaso;
    String nombreTipoCaso;
    Date fechaInicioVigencia;

    public void setCodTipoCaso(int codTipoCaso) {
        this.codTipoCaso = codTipoCaso;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public void setNombreTipoCaso(String nombreTipoCaso) {
        this.nombreTipoCaso = nombreTipoCaso;
    }

    public void setNroConfiguracion(int nroConfiguracion) {
        this.nroConfiguracion = nroConfiguracion;
    }

    public int getCodTipoCaso() {
        return codTipoCaso;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public String getNombreTipoCaso() {
        return nombreTipoCaso;
    }

    public int getNroConfiguracion() {
        return nroConfiguracion;
    }
    
    
    
}
