/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

public class Carros {

    double Total, Com, Ven5, Salmen;

    public void Salario(int n1, double n2) {
        Com = n1 * 150.00;
        Ven5 = n2 * 0.05;
        Salmen = 1000.00;
        Total = Com + Ven5 + Salmen;
    }
}
