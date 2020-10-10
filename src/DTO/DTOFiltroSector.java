
package DTO;

import java.util.Date;

public class DTOFiltroSector {
    private int codSector;
    private String nombreSector;
    private Date fechaFinVigenciaSector;

    public int getCodSector() {
        return codSector;
    }

    public void setCodSector(int codSector) {
        this.codSector = codSector;
    }

    public String getNombreSector() {
        return nombreSector;
    }

    public void setNombreSector(String nombreSector) {
        this.nombreSector = nombreSector;
    }

    public Date getFechaFinVigenciaSector() {
        return fechaFinVigenciaSector;
    }

    public void setFechaFinVigenciaSector(Date fechaFinVigenciaSector) {
        this.fechaFinVigenciaSector = fechaFinVigenciaSector;
    }
    
    
}
