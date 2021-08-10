/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author kmaye
 */
public class Calculos {

    int s,d,h;
    
    public void Convertir(int n1) {
        s = n1 / (24*7);
        d = n1 % (24*7) / 24;
        h = n1 % 24;
    }

}
