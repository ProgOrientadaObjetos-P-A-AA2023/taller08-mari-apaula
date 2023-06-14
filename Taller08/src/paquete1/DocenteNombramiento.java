/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA H
 */
public class DocenteNombramiento extends Docente{

    private int vSueldo;
    private int horaExtra;
    private int nHorasExtra;
    private int sueldo;

    public int obtenerValorSueldo() {
        return vSueldo;
    }

    public void establecerValorSueldo(int vSueldo) {
        this.vSueldo = vSueldo;
    }

    public int obtenerValorHoraExtra() {
        return horaExtra;
    }

    public void establecerValorHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    public int obtenerNumeroHorasExtra() {
        return nHorasExtra;
    }

    public void establecerNumeroHorasExtra(int nHorasExtra) {
        this.nHorasExtra = nHorasExtra;
    }

    public int obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo() {
        sueldo = (vSueldo + horaExtra) * nHorasExtra;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("Del docente %s con numero de cédula %s contiene la siguiente información\n"
                + "Valor sueldo: %d\n"
                + "Valor hora extra: %d\n"
                + "Numero horas extra: %d\n"
                + "Sueldo: %d\n\n", 
                obtenerNombres(),obtenerCedula(),
                obtenerValorSueldo(),
                obtenerValorHoraExtra(),
                obtenerNumeroHorasExtra(),
                obtenerSueldo());
        
        return reporte;
    }

}
