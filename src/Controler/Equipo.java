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
public class Equipo {
    public float calcularImporte(Alquiler contrato){
        int seguroEquipo    =   50;
        int importe =   seguroEquipo    +   5*contrato.getDias();
        return seguroEquipo +   importe;
    }
}
