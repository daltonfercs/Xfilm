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
public class Juego {
    
    String fabricante;

    public Juego(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public float calcularImporte(Alquiler contratar){
        String fabricante   =   this.fabricante;
        int tasa    =   0;
        if (fabricante.equals("PlayStation"))  tasa =   2;
        if (fabricante.equals("Nintendo"))  tasa    =1;
        int importe = tasa*contratar.getDias();
        return importe;
    }
    
}
