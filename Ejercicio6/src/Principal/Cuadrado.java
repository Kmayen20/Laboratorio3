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
public class Cuadrado {

    double A,B,C;
    
    public void Cuadrado(double n1, double n2) {
        A = Math.pow(n1, 2);
        B = Math.pow(n2, 2);
        C = 2*n1*n2;
    }

}
