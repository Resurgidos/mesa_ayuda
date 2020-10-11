
package Controller;

import DTO.DTOsConfiguración.DTOTipoConfiguracionGrilla;
import java.util.List;
import main.ExpertoConfigurar;

public class ControladorConfiguracionTipoCaso {
    
    ExpertoConfigurar expertoC = new ExpertoConfigurar();
    
    public void agregarConfiguracion(DTOTipoConfiguracionGrilla dtoTC){
       expertoC.agregarConfiguracion(dtoTC);
    }
    
    public List<DTOTipoConfiguracionGrilla> filtroConfiguracion(String nombreConfiguracion){
        return expertoC.filtroConfiguracion(nombreConfiguracion);
    }
    
    public String inputCodTipoCaso (String codCaso){   //Método para buscar un código de tipo caso para dar de alta una configuración
        return expertoC.inputCodTipoCaso(codCaso);
    }
}
