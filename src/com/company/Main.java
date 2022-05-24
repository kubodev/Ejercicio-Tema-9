package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(33);
        cliente.setTelefono("+56988689905");
        cliente.setNombre("Moises");
        cliente.setCredito(67.28);

        System.out.println("Cliente: " + cliente.getNombre() + "\nEdad: " + cliente.getEdad() + "\nTelefono: " +
                cliente.getTelefono() + "\nCredito: " + cliente.getCredito());

        System.out.println("");

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(28);
        trabajador.setTelefono("+56998745213");
        trabajador.setNombre("Carlos");
        trabajador.setSalario(2900.00);

        System.out.println("Trabajador: " + trabajador.getNombre() + "\nEdad: " + trabajador.getEdad() + "\nTelefono: " +
                trabajador.getTelefono() + "\nSalario: " + trabajador.getSalario());
    }


}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona() {

    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}


class Cliente extends Persona {
    private double credito;


    public Cliente() {

    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;


    public Trabajador() {

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}