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
public class Empleado {

    public static void imprimir_emp(Empleado Empleado1) {
        System.out.println("DNI: " + Empleado1.getDni());
        System.out.println("Nombre: " + Empleado1.getNombre());
        System.out.println("Cargo: " + Empleado1.getCargo());
        System.out.println("N\u00famero de hijos: " + Empleado1.getNumHijos());
        System.out.println("Sueldo: " + Empleado1.calcula_sueldo(1200));
    }
    private String dni;
    private String nombre;
    private String direccion;
    private String cargo;
    private int numHijos;
    
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    public double calcula_sueldo(double base){
        double total=base;
        
        if(getCargo().equals("ENCARGADO"))
            total+=300;
        else if(getCargo().equals("DIRECTOR"))
            total+=1000;
        if(getNumHijos()>=3)
            total+=getNumHijos()*50;
        return total;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the numHijos
     */
    public int getNumHijos() {
        return numHijos;
    }

    /**
     * @param numHijos the numHijos to set
     */
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
}