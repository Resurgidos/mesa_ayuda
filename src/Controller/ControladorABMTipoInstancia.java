
package Controller;

import DTO.DTOTipoInstancia;
import java.util.List;
import main.ExpertoTipoInstancia;

public class ControladorABMTipoInstancia {
 ExpertoTipoInstancia expertoTI = new ExpertoTipoInstancia();
 
    public DTOTipoInstancia agregarTipoInstancia(DTOTipoInstancia dtoTI){
        return expertoTI.agregarTipoInstancia(dtoTI) ;
    }
    public List<DTOTipoInstancia> filtradoTI(DTOTipoInstancia dtoTI){
       return expertoTI.filtradoTI(dtoTI) ; 
    }
    public List<DTOTipoInstancia> filtroAgregar(DTOTipoInstancia dtoTI){
        return expertoTI.filtroAgregar(dtoTI);
    }
    
}
