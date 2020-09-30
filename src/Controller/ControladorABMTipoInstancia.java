
package Controller;

import DTO.*;
import java.util.List;
import main.ExpertoTipoInstancia;

public class ControladorABMTipoInstancia {
 ExpertoTipoInstancia expertoTI = new ExpertoTipoInstancia();
 
    public DTOTipoInstancia agregarTipoInstancia(DTOTipoInstancia dtoTI){
        return expertoTI.agregarTipoInstancia(dtoTI) ;
    }
    public DTOTipoInstancia modificarTipoInstancia(DTOTipoInstancia dtoTI){
        return null;
    }
    public DTOTipoInstancia bajaTipoInstancia(DTOTipoInstancia dtoTI){
        return null;
    }
    public List<DTOTipoInstancia> filtroTI(String nombreTI){
        return expertoTI.filtroTI(nombreTI);
    }
    public List<DTOTipoInstancia> filtradoSector(String dtoTI){
       return expertoTI.filtradoSector(dtoTI); 
    }
    public List<DTOTipoInstancia> filtradoTT(String dtoTI){
       return expertoTI.filtradoTT(dtoTI);
      
    }
    
}
