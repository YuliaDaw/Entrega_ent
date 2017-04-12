/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrega_ent1;


/**
 *
 * @author ED06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado Empleado1 = new Empleado("1245678M","Perico de los Palotes");
        
        Empleado1.setDireccion("C/del Pez,6");
        Empleado1.setNumHijos(3);
        Empleado.imprimir_emp(Empleado1);
    }

    
}

