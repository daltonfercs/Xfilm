/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

/**
 *
 * @author dalton
 */
public class Peliculas {
    
    public float calcularImporte(Alquiler contrato){
        int importe =   2*contrato.getDias();
        return importe;
    }
    
}
