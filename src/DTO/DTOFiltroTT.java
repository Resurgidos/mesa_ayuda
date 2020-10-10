package DTO;

import java.util.Date;

public class DTOFiltroTT {
    private int codTipoTarea;
    private String nombreTipoTarea;
    private Date fechaFinVigenciaTT;

    public int getCodTipoTarea() {
        return codTipoTarea;
    }

    public void setCodTipoTarea(int codTipoTarea) {
        this.codTipoTarea = codTipoTarea;
    }

    public String getNombreTipoTarea() {
        return nombreTipoTarea;
    }

    public void setNombreTipoTarea(String nombreTipoTarea) {
        this.nombreTipoTarea = nombreTipoTarea;
    }

    public Date getFechaFinVigenciaTT() {
        return fechaFinVigenciaTT;
    }

    public void setFechaFinVigenciaTT(Date fechaFinVigenciaTT) {
        this.fechaFinVigenciaTT = fechaFinVigenciaTT;
    }
    
    
}
