/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DTO.DTOTipoCaso;
import main.ExpertoTipoCaso;
import java.util.List;
/**
 *
 * @author julie
 */
public class ControladorAMBTipoCaso {
    private ExpertoTipoCaso experto = new ExpertoTipoCaso();

    public DTOTipoCaso agregarTipoCaso(DTOTipoCaso dtoTCaso){   
        return  experto.agregarTipoCaso(dtoTCaso);
    }
    public DTOTipoCaso modificarTipoCaso(DTOTipoCaso dtoTCaso){
        
        return experto.modificarTipoCaso(dtoTCaso);
    }
     
    public void bajaTipoCaso(DTOTipoCaso dtoTCaso){
        experto.bajaTipoCaso(dtoTCaso);
    }
    
    public List<DTOTipoCaso> FiltradoMostrarDTO(String nombreTipoCaso){
        return experto.filtrado(nombreTipoCaso);
    }
}
