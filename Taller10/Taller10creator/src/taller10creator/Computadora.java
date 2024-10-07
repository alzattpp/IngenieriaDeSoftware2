/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10creator;

/**
 *
 * @author alzat
 */
public class Computadora {
    private String procesador;
    private String tarjetaGrafica;
    private int ram;


    public String getProcesador() {
        return procesador;
    }


    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }


    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }


    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }


    public int getRam() {
        return ram;
    }


    public void setRam(int ram) {
        this.ram = ram;
    }


    public Computadora(String procesador, String tarjetaGrafica, int ram) {
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.ram = ram;
    }
}