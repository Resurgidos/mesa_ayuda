
package Controller;

import DTO.DTOTipoConfiguracion;
import main.ExpertoConfigurar;

public class ControladorConfiguracionTipoCaso {
    
    ExpertoConfigurar expertoC = new ExpertoConfigurar();
    
    public void agregarConfiguracion(DTOTipoConfiguracion dtoTC){
       expertoC.agregarConfiguracion(dtoTC);
    }
}
