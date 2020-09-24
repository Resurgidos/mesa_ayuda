
package DTO;

import java.util.Date;

public class DTOSector {
    int  codSector;
    String nombreSector;
    String descripcionSector;
    Date fechaFinVigenciaSector;

    //Setters y Getters
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

    public String getDescripcionSector() {
        return descripcionSector;
    }

    public void setDescripcionSector(String descripcionSector) {
        this.descripcionSector = descripcionSector;
    }

    public Date getFechaFinVigenciaSector() {
        return fechaFinVigenciaSector;
    }

    public void setFechaFinVigenciaSector(Date fechaFinVigenciaSector) {
        this.fechaFinVigenciaSector = fechaFinVigenciaSector;
    }
    
    
    
}
