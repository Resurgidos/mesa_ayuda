
package Controller;

import DTO.DTOCriterio;
import DTO.DTOsConfiguración.DTOAgregarConfiguracion;
import DTO.DTOsConfiguración.DTOErroresMensajes;
import DTO.DTOsConfiguración.DTOModificarConf;
import DTO.DTOsConfiguración.DTOTipoConfiguracionGrilla;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import main.ExpertoConfigurar;

public class ControladorConfiguracionTipoCaso {
    
    ExpertoConfigurar expertoC = new ExpertoConfigurar();
    
    public DTOErroresMensajes agregarConfiguracion(DTOAgregarConfiguracion dtoAgregarConf){
       return expertoC.agregarConfiguracion(dtoAgregarConf);
    }
    public DTOErroresMensajes validarFecha(Date fechaDesde){
        return expertoC.validarFecha(fechaDesde);
    }
   /* public void agregarConfiguracion(DTOTipoConfiguracionGrilla dtoTC){
       expertoC.agregarConfiguracion(dtoTC);
    }*/
    
    public List<DTOTipoConfiguracionGrilla> filtroConfiguracion(String nombreConfiguracion){
        return expertoC.filtroConfiguracion(nombreConfiguracion);
    }
    
    public String inputCodTipoCaso (String codCaso){   //Método para buscar un código de tipo caso para dar de alta una configuración
        return expertoC.inputCodTipoCaso(codCaso);
    }
    
    public DTOModificarConf buscarPorNumConfig(int codSeleccionado){ 
        return expertoC.buscarPorNumConfig(codSeleccionado);       
    }
}
