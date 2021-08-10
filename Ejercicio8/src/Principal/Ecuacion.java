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
public class Ecuacion {

    double x1, x2;
    double discriminante;

    public void Ecuacion(double n1, double n2, double n3) {
        discriminante = n2*n2 - (4 * n1 * n3);
        x1 = (-n2 + Math.sqrt(discriminante))/(2 * n1);
        x2 = (-n2 - Math.sqrt(discriminante))/(2 * n1);
        
        
    }

}
